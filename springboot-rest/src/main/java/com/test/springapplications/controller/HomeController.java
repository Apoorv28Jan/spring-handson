package com.test.springapplications.controller;

import com.test.springapplications.model.ProductRequest;
import com.test.springapplications.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/test")
public class HomeController {
	
	@Autowired  
	private ProductService productService;

	@PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public void addUser(@RequestBody ProductRequest userRecord){
		productService.add(userRecord);
    }  
	
	/*
	 * @RequestMapping("/") public String hello() { return "index"; }
	 * 
	 * @RequestMapping(value = "/save", method = RequestMethod.POST) public
	 * ModelAndView save(@ModelAttribute User user) { ModelAndView modelAndView =
	 * new ModelAndView(); modelAndView.setViewName("user-data");
	 * modelAndView.addObject("user", user); return modelAndView; }
	 */
}
