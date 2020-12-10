package com.example.TestUF2406.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.TestUF2406.model.Book;
import com.example.TestUF2406.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {

	
	@Autowired
	BookService service;
	
	@RequestMapping("/showBooks")
	public String showBooks(Model model) {
		model.addAttribute("booksWeb", service.findAll());
		return "booksWeb";
	}
	@RequestMapping("/addBook")
	public String addBook(Model model) {
		
		return "addBook";
	}
	@RequestMapping("/insertBook")
	public String insertBook(Book book, Model model) {
		
		service.insertBook(book);
		
		model.addAttribute("booksWeb", service.findAll());
		
		return "redirect:/quotes/showquote";
	}
}
