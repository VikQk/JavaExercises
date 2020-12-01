package com.example.SpringLibrary.boot.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Optional;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.SpringLibrary.boot.model.User;
import com.example.SpringLibrary.boot.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService service;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@RequestMapping(value = { "/" ,"/*"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpSession session) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		
		
		
		String sid = session.getId();
		session.setAttribute("sid", sid);
		//System.out.println("Session id: " + sid);
		
		//session.setAttribute("status", StatusSession.CREATED);
		session.setAttribute("timestamp", formattedDate);

		model.addAttribute("clients", service.findAll());
		
		
		return "library/login";
	}
	
	
	@RequestMapping(value = { "/loginUser" }, method = RequestMethod.POST)
	public String loginCustomer ( @RequestParam("idUser") Long id, Model model, HttpSession session) {
		
		
		Optional<User> foundUser = service.findById(id);
	

		// Search for a book with an invalid ID
		if (foundUser.isPresent()) session.setAttribute("User", foundUser.get());
		
		return "library/login";
	}
	
	/*
	 * @RequestMapping(value = { "/*" }, method = RequestMethod.GET) public String
	 * error (Locale locale, Model model, HttpSession session) {
	 * 
	 * 
	 * //to-do error site return "shoping/error"; }
	 */

}
