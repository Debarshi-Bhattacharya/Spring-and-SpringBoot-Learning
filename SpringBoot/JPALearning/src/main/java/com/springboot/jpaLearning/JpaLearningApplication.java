package com.springboot.jpaLearning;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.jpaLearning.dao.UserRepository;
import com.springboot.jpaLearning.entities.User;

@SpringBootApplication
public class JpaLearningApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(JpaLearningApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
		
		//CRUD: CREATE, READ, UPDATE, DELETE
		
//		//1. Create object of user
//		User user1=new User(107,"Deba","ASN","JAVA Dev.");
//		User user2=new User(84,"Megha","KTRS","JAVA Dev.");
//		
//		//saving single user
//		userRepository.save(user1);
//		
//		//saving list of users
//		List<User>users=List.of(user1,user2);
//		Iterable<User>resultUsers=userRepository.saveAll(users);//this method takes Iterable as input parameter; as Iterable is parent of collection we can pass
//		//List as an Iterable here
//		resultUsers.forEach(user -> System.out.println(user));
//		
//		//UPDATE
//		Optional<User>optional=userRepository.findById(107);//finding the particular user by its id
//		User user=optional.get();//getting the user
//		user.setStatus("Full Stack Dev.");//updating a property of that user or, column of that row in the Database.
//		userRepository.save(user);
//		
//		
//		//DELETE
//		userRepository.deleteById(107);
//		
//		//Custom Finder method
//		List<User>foundUsers=userRepository.findByName("Megha");
//		foundUsers.forEach(founduser -> System.out.println(foundUsers));
//		List<User>foundUsers=userRepository.findByNameAndStatus("Debrup","MERN Dev.");
//		foundUsers.forEach(founduser -> System.out.println(foundUsers));
		List<User>foundUsers=userRepository.getUserByName("Deba");
		foundUsers.forEach(founduser -> System.out.println(foundUsers));
		List<User>allUsers=userRepository.getAllUsers();
		allUsers.forEach(founduser -> System.out.println(allUsers));
		
		
	}

}
