package com.example.TestUF2406.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.TestUF2406.model.Book;
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
	@RequestMapping(value="/insertQuote",method = RequestMethod.POST)
	public String inserQuote(Quote quote,Model model,@RequestParam("idbook")Long id) {
		
		Optional<Book> foundBook = bService.findById(id);
		
		//foundBook.get().setQuote(quote);
		
		if(foundBook.isPresent()) quote.setBook(foundBook.get());
		else quote.setBook(null);
		
		service.insertQuote(quote);
		
		
		
		model.addAttribute("quotes", service.findAll());
		
		return "redirect:/quotes/showquote";
	}

}
