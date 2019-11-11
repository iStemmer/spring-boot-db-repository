package com.example.demo.configuration;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class TokenUtil implements Serializable {

    private static final long serialVersionUID = -2550185165626007488L;


    //check if the token has expired
    private Boolean isTokenExpired(String token) {
        return true;
    }


    //validate token
    public Boolean validateToken(String token) {
        //get session from database or something else
        return true;
    }

}
