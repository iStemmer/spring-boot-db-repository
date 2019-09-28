package com.example.demo.repository;

import com.example.demo.model.Brief;

import java.util.List;

public interface BriefRepository {

    void add(Brief brief);

    void update(Brief brief);

    void delete(int id);

    Brief findById(int id);

    List<Brief> findByClientId(int clientId);
}
