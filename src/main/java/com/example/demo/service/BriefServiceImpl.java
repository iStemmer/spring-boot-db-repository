package com.example.demo.service;

import com.example.demo.model.Brief;
import com.example.demo.repository.BriefRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BriefServiceImpl implements BriefService {

    private BriefRepository briefRepository;

    @Autowired
    public BriefServiceImpl(BriefRepository briefRepository) {
        this.briefRepository = briefRepository;
    }

    @Override
    public void add(Brief brief) {
        briefRepository.add(brief);

    }

    @Override
    public void update(Brief brief) {
        briefRepository.update(brief);
    }

    @Override
    public void delete(int id) {
        briefRepository.delete(id);
    }

    @Override
    public Brief findById(int id) {
        return briefRepository.findById(id);
    }

    @Override
    public List<Brief> findByClientId(int clientId) {
        return briefRepository.findByClientId(clientId);
    }
}
