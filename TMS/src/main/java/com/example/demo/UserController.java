package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

 @Autowired
 private UserService service;
 
 List<String> courses; 
 
 @ModelAttribute
 public void preLoad() {
  courses = new ArrayList<String>();
  courses.add("C");
  courses.add("CPP");
  courses.add("Java");
 }

 @RequestMapping(value = "/", method = RequestMethod.GET)
 public String home(Model model,User user) {
  model.addAttribute("courses",courses);
  return "register";
 }
 
 @RequestMapping(value = "/save",method = RequestMethod.POST)
 public String register(@ModelAttribute("user")User user, Model model) {
 // System.out.println("get coursess:::"+student.getCourse());
  service.save(user);
  return "welcome";
 }
 
}