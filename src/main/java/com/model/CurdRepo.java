package com.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component("repo")
public interface CurdRepo extends JpaRepository<Student, Integer> {

}
