package com.example.SpringLibrary.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SpringLibrary.boot.model.User;
import com.example.SpringLibrary.boot.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping("/show")
	public String showUsers(Model model) {
		
		model.addAttribute("Users", service.findAll());
		return "library/user";
	}

	@RequestMapping("/addUser")
	public String addUser(Model model) {
		
		return "library/addUser";
	}
	
	@RequestMapping("/insertUser")
	public String insertUser(User user, Model model) {
		
		service.insertUser(user);
		
		model.addAttribute("user", service.findAll());
		return "library/user";
	}
}
