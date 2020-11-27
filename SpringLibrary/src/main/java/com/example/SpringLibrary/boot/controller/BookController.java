package com.example.SpringLibrary.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.SpringLibrary.boot.model.Book;
import com.example.SpringLibrary.boot.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {

	
	@Autowired
	BookService service;
	
	@RequestMapping("/show")
	public String showBooks(Model model) {
			
		model.addAttribute("books", service.findAll());
		return "library/books";
			
	}
	@RequestMapping("/insertBook")
	public String insertBook (Book book, Model model) {
		System.out.println(model.getAttribute(book.getAuthor()));
		System.out.println(book.getTitle());
		service.insertBook(book);
		model.addAttribute("library",service.findAll());
		
		return "redirect: books/library.html";
	}
	
	@RequestMapping("/deleteBook")
	public String deleteBook(@RequestParam("bookId") int id, Model model) {
		
		Book book = new Book(id);		
		service.deleteBook(book);
		
		model.addAttribute("books",service.findAll());
		
		return "redirect:/books/show";
	}
}

