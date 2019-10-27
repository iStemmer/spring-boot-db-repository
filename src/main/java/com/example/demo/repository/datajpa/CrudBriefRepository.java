package com.example.demo.repository.datajpa;

import com.example.demo.model.Brief;
import org.springframework.data.jpa.repository.JpaRepository;

//we can use @Repository here, but it is not enough for extension
public interface CrudBriefRepository extends JpaRepository<Brief, Long> {
}
