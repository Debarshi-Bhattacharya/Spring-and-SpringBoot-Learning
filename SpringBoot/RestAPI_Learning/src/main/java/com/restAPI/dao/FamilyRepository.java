package com.restAPI.dao;

import org.springframework.data.repository.CrudRepository;

import com.restAPI.entities.Family;


public interface FamilyRepository extends CrudRepository<Family,Integer>{
	

}
