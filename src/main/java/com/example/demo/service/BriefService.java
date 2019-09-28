package com.example.demo.service;

import com.example.demo.model.Brief;

import java.util.List;

public interface BriefService {

    void add(Brief brief);

    void update(Brief brief);

    void delete(int id);

    Brief findById(int id);

    List<Brief> findByClientId(int clientId);

}
