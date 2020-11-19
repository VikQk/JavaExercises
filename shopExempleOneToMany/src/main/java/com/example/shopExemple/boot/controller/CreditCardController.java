package com.example.shopExemple.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.shopExemple.boot.service.CreditCardService;
import com.example.shopExemple.boot.service.CustomerService;
import com.example.shopExemple.boot.model.CreditCard;


@Controller
@RequestMapping("/creditcards")
public class CreditCardController {

	@Autowired
	CreditCardService service;
	@Autowired
	CustomerService serviceCustomer;

	@RequestMapping("/show")
	public String showCreditCards (Model model) {

		model.addAttribute("cards", service.findAll());
		return "shoping/cards.html";
	}
	
	
	@RequestMapping("/addCreditCard")
	public String addCreditCard(Model model) {

		model.addAttribute("clients", serviceCustomer.findAll());
		
		return "shoping/addCard.html";
	}

	@RequestMapping("/insertCreditCard")
	public String insertCreditCard(CreditCard creditCard,Model model) {
		//@RequestParam("idCustomer") Long idCustomer
		service.insertCreditCard(creditCard);
		
		
		model.addAttribute("cards", service.findAll());
		return "shoping/cards.html";
	}
}