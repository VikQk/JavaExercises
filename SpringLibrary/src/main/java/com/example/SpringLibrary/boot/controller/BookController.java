package com.example.SpringLibrary.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
}

