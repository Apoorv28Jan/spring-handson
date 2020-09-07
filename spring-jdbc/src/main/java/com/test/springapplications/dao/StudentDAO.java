package com.test.springapplications.dao;

import com.test.springapplications.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;


public class StudentDAO {
	
	private JdbcTemplate JDBCTemplate;

	public void setJDBCTemplate(JdbcTemplate jdbcTemplate){
		this.JDBCTemplate = jdbcTemplate;
	}
	
	public int saveStudent(Student s){
		String sql = "insert into student values(" + s.getId() + ",'" + s.getName() + "'," + s.getAge()+ ")" ; 
		return JDBCTemplate.update(sql);
	}

		
}
