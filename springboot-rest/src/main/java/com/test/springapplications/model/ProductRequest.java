package com.test.springapplications.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Hello world!
 *
 */

@Entity
@Table(name = "apoorv")
public class ProductRequest {
	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Long userId;

	@Column(name = "AGE")
	private Integer age;

	@Column(name = "NAME")
	private String name;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ProductRequest [userId=" + userId + ", age=" + age + ", name=" + name + "]";
	}
	/*
	 * public static void main( String[] args ) { System.out.println( "Hello World!"
	 * ); }
	 */
}
