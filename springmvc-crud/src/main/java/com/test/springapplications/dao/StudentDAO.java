package com.test.springapplications.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.test.springapplications.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class StudentDAO {

	
	private JdbcTemplate JDBCTemplate;

	public void setJDBCTemplate(JdbcTemplate jdbcTemplate){
		this.JDBCTemplate = jdbcTemplate;
	}
	
	public String insert(Student student){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		JDBCTemplate = (JdbcTemplate)context.getBean("jdbcTemplate");
		
		String sql = "insert into student values(" + student.getId() + ",'" + student.getName() + "'," + student.getAge()+ ")" ; 
		System.out.println(JDBCTemplate);
		int result = JDBCTemplate.update(sql);
  
		if(result > 0){		
			return "record inserted successfully";
		}else{
			return "record not inserted";
		}
	}
	
	public Student searchById(int id){
		Student student = new Student();
	     try{

	        Class.forName("com.mysql.jdbc.Driver");
	        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/apoorv","apoorv","apoorv");
	        PreparedStatement ps =con.prepareStatement("select * from student where id=?");
	        ps.setInt(1, id);
	        
	        ResultSet rs =ps.executeQuery();
	        while(rs.next()){
	        	student.setId(rs.getInt("id"));
	        	student.setName(rs.getString("name"));
	        	student.setAge(rs.getInt("age"));
	        }
	       
	     }catch(Exception e){
	         e.printStackTrace();
	     }
		
		return student;
	}
	
	
}
