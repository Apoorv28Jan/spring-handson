package com.test.springapplications;

import com.test.springapplications.dao.StudentDAO;
import com.test.springapplications.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		StudentDAO sdao = (StudentDAO)context.getBean("sdao");
		int result = sdao.saveStudent(new Student(1008, "deepesh", 25));
		System.out.println(result);
		

	}

}
