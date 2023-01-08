package com.springboot.jpaLearning.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.jpaLearning.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	public List<User> findByName(String name);
	//findByName: 'find' is introducer, ByName:criteria, where Name is the property(here mentioned in camel case)
	//on which basis we are querying on the database. 
	//Query creation: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.query-creation
	public List<User> findByNameAndStatus(String name,String status);//this method will search the match for given name and status 
	
	//Running JPQL(Java Persistence Query Language) through methods by @Query annotation
	@Query("select u from User u where name=:n")
	//Parameterized Query: binding the parameter of the Query with the argument of the method 
	public List<User> getUserByName(@Param("n") String name);
	
	//Running Native Query through methods by @Query annotation
	@Query(value="select * from User",nativeQuery = true)
	public List<User>getAllUsers();

}


