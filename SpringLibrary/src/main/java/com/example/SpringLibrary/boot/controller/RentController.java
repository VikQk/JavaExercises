package com.example.SpringLibrary.boot.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Optional;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.SpringLibrary.boot.model.Book;
import com.example.SpringLibrary.boot.model.Rent;
import com.example.SpringLibrary.boot.model.User;
import com.example.SpringLibrary.boot.service.BookService;
import com.example.SpringLibrary.boot.service.RentService;
import com.example.SpringLibrary.boot.service.UserService;

@Controller
@RequestMapping("/rents")
public class RentController {

	
	@Autowired
	RentService service;
	
	@Autowired
	BookService bService;
	
	@Autowired
	UserService uService;
	
	@RequestMapping("/show")
	public String showRents(Model model,HttpSession session) {
				
		model.addAttribute("rent", service.findAll());
		return "library/rent";
			
	}
	
	@RequestMapping("/createRent")
	public String createRent(@RequestParam("bookId") Long id,Locale locale, Model model,HttpSession session) {
		
		Optional<Book> foundBook = bService.findById(id);
		Optional<User> foundUser = uService.findById((Long)session.getAttribute("userId"));
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		Rent rent = new Rent ();
		rent.setUserId(foundUser.get());
		rent.setBookId(foundBook.get());
		String time=(String) formattedDate;
		rent.setTime(time);
		service.insertRent(rent);
		
		model.addAttribute("rent",service.findAll());
		
		return "redirect:/rents/show";
	}
	
	@RequestMapping("/insertRent")
	public String insertRent (@RequestParam("rentId")Long id, Model model, HttpSession session) {
		
		System.out.println("rentId");
		//service.insertRent(rent);
		model.addAttribute("library",service.findAll());
		
		return "redirect: /rents/show";
	}
	
	@RequestMapping("/deleteRent")
	public String deleteBook(@RequestParam("rentId") Long id, Model model) {
		
		Rent rent = new Rent(id);		
		service.deleteRent(rent);
		
		model.addAttribute("rent",service.findAll());
		
		return "redirect:/rents/show";
	}
}
