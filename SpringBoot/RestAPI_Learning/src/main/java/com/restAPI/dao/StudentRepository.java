package com.restAPI.dao;

import org.springframework.data.repository.CrudRepository;

import com.restAPI.entities.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {
	

}
