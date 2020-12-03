package com.example.SpringLibrary.boot.controller;

import java.text.DateFormat;
import java.util.*;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.SpringLibrary.boot.model.Book;
import com.example.SpringLibrary.boot.model.User;
import com.example.SpringLibrary.boot.service.BookService;
import com.example.SpringLibrary.boot.service.UserService;

@Controller
@RequestMapping("/books")
public class BookController {

	
	@Autowired
	BookService service;
	
	@Autowired
	UserService uService;
	
	@RequestMapping("/show")
	public String showBooks(Locale locale, Model model,  HttpSession session) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		
	
		
		model.addAttribute("books", service.findAll());
		
		//System.out.println(service.findById((Long)session.getAttribute("userId")));
		model.addAttribute("user","Bienvenido: " + uService.findById((Long)session.getAttribute("userId")).get().getName());
		
		
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
	public String deleteBook(@RequestParam("bookId") Long id, Model model) {
		
		Book book = new Book(id);		
		service.deleteBook(book);
		
		model.addAttribute("books",service.findAll());
		
		return "redirect:/books/show";
	}
}