package com.shoe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shoe.dao.ProductDao;

import com.shoe.model.Product;
@Controller
public class AdminController {
		
			@Autowired
			ProductDao productdao;
		@RequestMapping("/admin")
			public String admin()
			{
			System.out.println("admin called");
			return "admin";
		}
		@RequestMapping("/addproduct")
		public ModelAndView addproduct()
		{
			Product product=new Product();
			System.out.println("addproduct called");
			return new ModelAndView("addproduct","pro",product);		}	


@RequestMapping("/addTheProduct")
public ModelAndView addTheProduct(@ModelAttribute("pro")Product product)
{
	productdao.addproduct(product);
	return new ModelAndView("viewproduct");
	
}
}
