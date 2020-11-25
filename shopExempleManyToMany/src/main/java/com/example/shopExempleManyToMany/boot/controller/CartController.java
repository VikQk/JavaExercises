package com.example.shopExempleManyToMany.boot.controller;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.shopExempleManyToMany.boot.model.Product;
import com.example.shopExempleManyToMany.boot.model.ProductCart;
import com.example.shopExempleManyToMany.boot.service.ProductService;

@Controller
@RequestMapping(value = "cart")
public class CartController {

	@Autowired
	ProductService service;

	@RequestMapping(value = "show", method = RequestMethod.GET)
	public String home() {
		return "shoping/cart";
	}

	@RequestMapping(value = "addToCart", method = RequestMethod.GET)
	public String add(@RequestParam("itemId") Long id, HttpSession session) {

		// ProductModel productModel = new ProductModel();

		if (session.getAttribute("cart") == null) {

			List<ProductCart> cart = new ArrayList<ProductCart>();

			cart.add(new ProductCart(service.findById(id), 1));
			session.setAttribute("cart", cart);

		} else {

			List<ProductCart> cart = (List<ProductCart>) session.getAttribute("cart");

			int index = this.exists(id, cart);
			if (index == -1) {
				cart.add(new ProductCart(service.findById(id), 1));
			} else {
				int quantity = cart.get(index).getQuantity() + 1;
				cart.get(index).setQuantity(quantity);
			}

			session.setAttribute("cart", cart);
		}

		String sid = session.getId();
		session.setAttribute("sid", sid);
		System.out.println("Session id: " + sid);

		return "redirect:/cart/show";
	}

	@RequestMapping(value = "removeFromCart", method = RequestMethod.GET)
	public String remove(@RequestParam("itemId") Long id, HttpSession session) {

		// ProductModel productModel = new ProductModel();
		List<ProductCart> cart = (List<ProductCart>) session.getAttribute("cart");
		int index = this.exists(id, cart);

		int quantity = cart.get(index).getQuantity();

		if (quantity > 0) {
			quantity--;
			cart.get(index).setQuantity(quantity);

			if (quantity == 0)
				cart.remove(index);
		}

		session.setAttribute("cart", cart);

		return "redirect:/cart/show";
	}

	@RequestMapping(value = "deleteSession", method = RequestMethod.GET)
	public String deleteSession(HttpSession session) {

		if (session.getAttribute("cart") != null) {
			session.invalidate();
		}

		return "redirect:/cart/index";
	}

	@RequestMapping(value = "deleteCart", method = RequestMethod.GET)
	public String deleteCart(HttpSession session) {

		if (session.getAttribute("cart") != null) {

			// ProductModel productModel = new ProductModel();
			List<Product> cart = new ArrayList<Product>();
			cart.removeAll(cart);
			session.setAttribute("cart", cart);

		}

		return "redirect:/cart/index";
	}

	private int exists(Long id, List<ProductCart> cart) {

		for (int i = 0; i < cart.size(); i++) {

			if (cart.get(i).getProduct().getId() == id) {
				return i;
			}

		}
		return -1;
	}

}
