package com.example.shopExemple.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.shopExemple.boot.service.CreditCardService;

@Controller
@RequestMapping("/creditcards")
public class CreditCardController {

	@Autowired
	CreditCardService service;

	@RequestMapping("/show")
	public String showCreditCards (Model model) {

		model.addAttribute("cards", service.findAll());
		return "shoping/cards.html";
	}
}