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
 private int id;
 @Column(name = "first_name")
 private String firstName;
 @Column(name = "last_name")
 private String lastName;
 @Column(name = "gender")
 private String gender;
 @Column(name = "course")
 private String course;
 @Column(name = "email")
 private String email;

 @Column(name = "mobile_number")
 private String mobileNumber;
 @Column(name = "dob")
 private String dob;
 
}