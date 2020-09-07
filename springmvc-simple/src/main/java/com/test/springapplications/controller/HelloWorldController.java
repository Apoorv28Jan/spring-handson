package com.test.springapplications.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller 
public class HelloWorldController {

	    @RequestMapping("/hello")  
	    public ModelAndView helloWorld() {  
	        String message = "HELLO SPRING MVC HOW R U"; 
	        ModelAndView mv=new ModelAndView();
	        mv.addObject("message", message);
	        mv.setViewName("welcomepage");
	        return mv;
	        //return new ModelAndView("welcomepage", "message", message);  
	    }  

}
