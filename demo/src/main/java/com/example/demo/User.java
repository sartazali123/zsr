package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user_details")
@Setter
@Getter

public class User{
	
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	 private long id;
	 
	 @Column(name = "name")
	 private String Name;

	 @Column(name = "gender")
	 private String gender;
	 @Column(name = "course")
	 private String course;
	 @Column(name = "email")
	 private String email;

	 @Column(name = "mobile_number")
	 private String mobilenumber;
	 
	 @Column(name = "dob")
	 private String dob;
	 
	
	
	
 public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDob() {
		return dob;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	
	public User() {}
	public User(long id, String name, String gender, String course, String email, String mobilenumber, String dob) {
		super();
		this.id = id;
		Name = name;
		this.gender = gender;
		this.course = course;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.dob = dob;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
 
 
}
