package com.example.demo.service;

import com.example.demo.model.Brief;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BriefService {

    void add(Brief brief);

    void update(Brief brief);

    void delete(int id);

    Brief findById(int id);

    List<Brief> findAll(Integer pageNo, Integer pageSize, String sortBy);

    Page<Brief> findAllPage(Integer pageNo, Integer pageSize, String sortBy);


}
