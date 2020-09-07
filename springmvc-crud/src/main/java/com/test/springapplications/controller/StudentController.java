package com.test.springapplications.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.springapplications.dao.StudentDAO;
import com.test.springapplications.entity.Student;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@ControllerAdvice  
public class StudentController {
	
	@RequestMapping("/insert") 
	public ModelAndView insert(HttpServletRequest request,HttpServletResponse res) {  
	
		Student student = new Student();
		StudentDAO dao =  new StudentDAO();
		
		student.setId(Integer.parseInt(request.getParameter("id"))); 
		student.setName( request.getParameter("name")); 
		student.setAge(Integer.parseInt(request.getParameter("age")));
	
		String msg = dao.insert(student);
		
		ModelAndView mView=new ModelAndView();
		
		mView.addObject("message", msg);
		mView.setViewName("success");
		
		return mView;
	}
	@RequestMapping("/select") 
	public ModelAndView select(HttpServletRequest request,HttpServletResponse res) {  
	
		StudentDAO dao =  new StudentDAO();
		int id = Integer.parseInt(request.getParameter("id"));
	
		Student student = dao.searchById(id);
		
		ModelAndView mView=new ModelAndView();
		
		mView.addObject("student", student);
		mView.setViewName("displayUser");
		
		return mView;
	}


	 
}


