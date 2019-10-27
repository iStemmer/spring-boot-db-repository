package com.example.demo.service;

import com.example.demo.model.Brief;
import com.example.demo.repository.BriefRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<Brief> findAll(Integer pageNo, Integer pageSize, String sortBy) {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

        Page<Brief> pagedResult = briefRepository.findBySortAndPage(paging);

        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Brief>();
        }
    }

    public Page<Brief> findAllPage(Integer pageNo, Integer pageSize, String sortBy) {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        return briefRepository.findBySortAndPage(paging);
    }
}
