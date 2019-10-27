package com.example.demo.repository;

import com.example.demo.model.Brief;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BriefRepository {

    void add(Brief brief);

    void update(Brief brief);

    void delete(int id);

    Brief findById(int id);

    List<Brief> findAll();

    Page<Brief> findBySortAndPage(Pageable page);

}
