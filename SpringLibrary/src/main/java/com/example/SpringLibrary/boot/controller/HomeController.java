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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.SpringLibrary.boot.model.User;
import com.example.SpringLibrary.boot.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService service;	

	@RequestMapping(value = { "/" ,"/*"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpSession session) {
		
		//Unicamente muestra la hora actual de nuesto equipo.
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		session.setAttribute("serverTime", formattedDate);
		
		//creamos un string donde guardamos el numero de sesion creado automaticamente 
		//añadimos un atributo llamado "sid" a nuestra sesion que contiene el String Sid creado anteriormente, para que nuestra web login.html pueda renderizar en pantalla.
		String sid = session.getId();
		session.setAttribute("sid", sid);
		
		//añadimos a model un atributo llamado "clients" que contendra todos los clients que encuentre service en nuestra DB H2.
		model.addAttribute("clients", service.findAll());
				
		return "library/login";
	}
	
	
	@RequestMapping(value = { "/loginUser" }, method = RequestMethod.POST)
	public String loginCustomer ( @RequestParam("idUser") Long id, Model model, HttpSession session) {
				
		Optional<User> foundUser = service.findById(id);	

		session.setAttribute("userId",id);
		// Search for a book with an invalid ID
		if (foundUser.isPresent()) session.setAttribute("User", foundUser.get());
		
		return "redirect:/books/show";
	}
}
