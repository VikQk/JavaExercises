package com.example.TestUF2406.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.TestUF2406.model.Quote;
import com.example.TestUF2406.service.BookService;
import com.example.TestUF2406.service.QuoteService;

@Controller
@RequestMapping("/quotes")
public class QuoteController {
	
	@Autowired
	QuoteService service;
	
	@Autowired
	BookService bService;
	
	
	@RequestMapping("/showquote")
	public String showQuotes (Model model) {
		
		model.addAttribute("QuotesWeb", service.findAll());		
		return "QuotesWeb";
				
	}
	@RequestMapping("/addQuote")
	public String addQuote (Model model) {
		
		model.addAttribute("books", bService.findAll());
		return "addQuote";
		
	}
	@RequestMapping("/insertQuote")
	public String inserQuote(Quote quote,Model model) {
		
		service.insertQuote(quote);
		
		model.addAttribute("quotes", service.findAll());
		
		return "redirect;QuotesWeb";
	}

}
