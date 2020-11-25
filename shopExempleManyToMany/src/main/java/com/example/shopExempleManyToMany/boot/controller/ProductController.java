package com.example.shopExempleManyToMany.boot.controller;

import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.example.shopExempleManyToMany.boot.model.Product;
import com.example.shopExempleManyToMany.boot.service.CustomerService;
import com.example.shopExempleManyToMany.boot.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService service;

	@RequestMapping("/show")
	public String showProducts (Model model) {

		model.addAttribute("items", service.findAll());
		return "shoping/items.html";
	}

	@RequestMapping("/addItem")
	public String addProduct (Model model) {

		return "shoping/addItem.html";
	}

	@RequestMapping("/insertItem")
	public String insertProduct (Product product, Model model) {

		service.insertProduct (product);

		model.addAttribute("items", service.findAll());
		return "shoping/items.html";
	}
	
	

}


