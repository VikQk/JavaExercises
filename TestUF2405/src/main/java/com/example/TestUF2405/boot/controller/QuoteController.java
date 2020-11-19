package com.example.TestUF2405.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.TestUF2405.boot.service.BookService;
import com.example.TestUF2405.boot.service.QuoteService;

@Controller
@RequestMapping("/quotes")
public class QuoteController {
	
	@Autowired
	QuoteService service;
	
	
	@RequestMapping("/showquote")
	public String showQuotes (Model model) {
		
		model.addAttribute("QuotesWeb", service.findAll());		
		return "QuotesWeb";
				
	}

}
