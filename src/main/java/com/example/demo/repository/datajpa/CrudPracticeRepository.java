package com.example.demo.repository.datajpa;

import com.example.demo.model.Practice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudPracticeRepository extends JpaRepository<Practice, Long> {
}
