package com.example.SpringLibrary.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.SpringLibrary.boot.model.Book;
import com.example.SpringLibrary.boot.model.Rent;
import com.example.SpringLibrary.boot.service.BookService;
import com.example.SpringLibrary.boot.service.RentService;

@Controller
@RequestMapping("/rents")
public class RentController {

	
	@Autowired
	RentService service;
	
	@RequestMapping("/show")
	public String showRents(Model model) {
			
		model.addAttribute("rent", service.findAll());
		return "library/rent";
			
	}
	@RequestMapping("/insertRent")
	public String insertBook (Rent rent, Model model) {
		
		System.out.println(rent.getId());
		service.insertRent(rent);
		model.addAttribute("library",service.findAll());
		
		return "redirect: /rents/show";
	}
	
	@RequestMapping("/deleteRent")
	public String deleteBook(@RequestParam("rentId") int id, Model model) {
		
		Rent rent = new Rent(id);		
		service.deleteRent(rent);
		
		model.addAttribute("rent",service.findAll());
		
		return "redirect:/rents/show";
	}
}
