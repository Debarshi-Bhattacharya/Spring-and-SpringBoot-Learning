package com.restAPI.controllers;

import com.restAPI.entities.Book;
import com.restAPI.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//@Controller
@RestController
public class BookControllers {

	@Autowired
	private BookService bookService;


	//@ResponseBody(is not needed in case of Rest Controller)
	//this annotation is used send the return statement of this method as string

	//create book handler
	@PostMapping(value="/addBooks")
	public String addBooks(@RequestBody List<Book> books)
	{
		this.bookService.addBook(books);
		return "given books are added";
	}

	//get book handler
	//@RequestMapping(value="/books",method=RequestMethod.GET)
	@GetMapping(value="/books")
	//this is equivalent to @RequestMapping(value="/books",method=RequestMethod.GET)
	public List<Book> getBooks()
	{
		return this.bookService.getALLBooks();
	}

	@GetMapping(value="/books/{id}")
	public Book getBookById(@PathVariable("id") int id)
	{
		return this.bookService.getBookById(id);
	}

	//update book handler
	@PutMapping("/books/{bookId}")
	public String updateBookById(@RequestBody Book book,@PathVariable("bookId") int bookId)
	{
		this.bookService.updateBook(book,bookId);
		return "given book updated";
	}

	//delete book handler
	@DeleteMapping("/books/{bookId}")
	public String deleteBookById(@PathVariable("bookId") int bookId)
	{
		return this.bookService.deleteBook(bookId);
	}


}
