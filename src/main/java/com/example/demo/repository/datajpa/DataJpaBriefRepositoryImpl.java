package com.example.demo.repository.datajpa;

import com.example.demo.model.Brief;
import com.example.demo.repository.BriefRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaBriefRepositoryImpl implements BriefRepository {

    @Autowired
    private CrudBriefRepository briefRepository;

    @Override
    public void add(Brief brief) {
        briefRepository.save(brief);
    }

    @Override
    public void update(Brief brief) {
        briefRepository.save(brief);
    }

    @Override
    public void delete(int id) {
        briefRepository.deleteById((long) id);
    }

    @Override
    public Brief findById(int id) {
        return briefRepository.findById((long) id).orElse(null);
    }

    @Override
    public List<Brief> findByClientId(int clientId) {
        return briefRepository.findAllByClientId(clientId);
    }
}
