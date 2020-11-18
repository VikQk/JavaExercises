package com.example.TestUF2405.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.TestUF2405.boot.service.BookService;

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
}
