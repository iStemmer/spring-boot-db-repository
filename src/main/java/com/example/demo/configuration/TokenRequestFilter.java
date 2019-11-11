package com.example.demo.configuration;

import com.example.demo.model.TokenUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//https://www.javainuse.com/spring/boot-jwt
@Component
public class TokenRequestFilter extends OncePerRequestFilter {

    @Autowired
    private TokenUtil tokenUtil;

    //Если мы хотим кидаться статусами, то надо обязательно бросать ошибку, которую будет ловить TokenAuthenticationEntryPoint
    //если ошибку не кидать - то запрос будет фильтроваться, но не будет приходить статусы сервера
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        final String requestTokenHeader = request.getHeader("Authorization");
// JWT Token is in the form "Bearer token". Remove Bearer word and get
// only the Token
        String jwtToken = null;
        if (requestTokenHeader != null && requestTokenHeader.startsWith("Bearer ")) {
            jwtToken = requestTokenHeader.substring(7);
        } else {
            logger.warn("JWT Token does not begin with Bearer String");
            throw new InsufficientAuthenticationException("JWT Token does not begin with Bearer String");
        }
// Once we get the token validate it.
// if token is valid configure Spring Security to manually set
// authentication
            if (tokenUtil.validateToken(jwtToken)) {
                UserDetails user = new TokenUserDetails("admin", null);
                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
                        user, null, user.getAuthorities());
                usernamePasswordAuthenticationToken
                        .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
// After setting the Authentication in the context, we specify
// that the current user is authenticated. So it passes the
// Spring Security Configurations successfully.
                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            }
        chain.doFilter(request, response);
    }
}
