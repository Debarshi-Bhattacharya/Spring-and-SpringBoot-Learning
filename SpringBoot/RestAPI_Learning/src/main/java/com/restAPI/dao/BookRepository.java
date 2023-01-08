package com.restAPI.dao;

import com.restAPI.entities.Book;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {
    Book findById(int id);

    @Modifying
    @Transactional
    @Query("Update Book b set b.author = ?1 , b.title= ?2 where b.id= ?3")
    public void findAndUpdateBook(String author,String title,int bid);
}
