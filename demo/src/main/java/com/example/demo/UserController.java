package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;    

@Controller    
//@RestController    

public class UserController   
{    
	
    @Autowired
    UserService userservice;

@RequestMapping("/")    
public String index()  
{    
return "index";    
}    
/*
 * @RequestMapping(value="/save", method=RequestMethod.POST) public ModelAndView
 * save(@ModelAttribute User user) { ModelAndView modelAndView = new
 * ModelAndView(); modelAndView.setViewName("user-data");
 * modelAndView.addObject("user", user); return modelAndView; }
 */ 

@RequestMapping(value="/save",method = RequestMethod.POST)  
private String save(User user)   
{  
		userservice.save(user);  
		
		return "index";  
}  

@GetMapping("/userdata")  
private String getAllUsers(Model model)   
{  

	   model.addAttribute("listUsers", userservice.getAllUser());
       return "user-data";
	
	//return userservice.getAllUser();
	  
}  

@GetMapping("/updateUser/{id}")
public  String UpdateUser(@PathVariable(value = "id") long id, Model model) {

    // get employee from the service
    User user = userservice.getUserById(id);

    // set employee as a model attribute to pre-populate the form
    model.addAttribute("user",user);
    return "update_user";
}




@GetMapping("/deleteUser/{id}")  
private String deleteUser(@PathVariable("id") long id)   
{  
	 this.userservice.deleteUserById(id);
	 
	  return "user-data";
} 


}  