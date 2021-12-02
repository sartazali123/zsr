package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
 @Autowired
 private UserRepository repository;
 public void save(User user) {
  repository.save(user);
 }
}