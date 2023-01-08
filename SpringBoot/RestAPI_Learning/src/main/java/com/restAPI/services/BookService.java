package com.restAPI.services;

import com.restAPI.dao.BookRepository;
import com.restAPI.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    //get all books
    public List<Book> getALLBooks()
    {
        List<Book> allBooks=(List<Book>) this.bookRepository.findAll();
        return allBooks;
    }

    //get particular book by id
    public Book getBookById(int id)
    {
        Book book=null;
        try
        {
            book=this.bookRepository.findById(id);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return book;
    }
    //adding book
    public void addBook(List<Book> books)
    {
        this.bookRepository.saveAll(books);

    }
    //update book
    public void updateBook(Book book,int id)
    {
        this.bookRepository.findAndUpdateBook(book.getAuthor(),book.getTitle(),id);

    }
    //deleting book
    public String deleteBook(int id)
    {
        Optional<Book>optional= Optional.ofNullable(this.bookRepository.findById(id));
        Book b=optional.get();
        String message="null";
        message="The book named "+b.getTitle()+" by "+b.getAuthor()+" is deleted";
        this.bookRepository.deleteById(id);
        return message;

    }

}
