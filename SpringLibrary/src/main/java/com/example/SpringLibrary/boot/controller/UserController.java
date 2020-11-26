package com.example.SpringLibrary.boot.controller;

import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		
		System.out.println(model.getAttribute(user.getLastName()));
		System.out.println(user.getName());
		service.insertUser(user);
		model.addAttribute("user",service.findAll());
		return "redirect:/user/show";
	}
	
	@RequestMapping("/deleteUser")
	public String deleteUser(@RequestParam("userId") int id , Model model) {
		
		User user = new User(id);
		service.deleteUser(user);
		
		
		model.addAttribute("user", service.findAll());
		return "redirect:/user/show";
	}
}
