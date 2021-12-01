package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@Transactional
public class UserService {
 @Autowired
 private UserRepository userrepository;
 
 public void save(User user) {
	 userrepository.save(user);
 }
 public List<User> getAllUser()   
 {  
	 
		 List<User> user = new ArrayList<User>();  
		 userrepository.findAll().forEach(books1 -> user.add(books1));  
		 return user;  
 
 }
 
public void deleteUserById(long id) {
	  
		this.userrepository.deleteById(id);

}
public User getUserById(long id) {
    Optional < User > optional = userrepository.findById(id);
    User user = null;
    if (optional.isPresent()) {
    	user = optional.get();
    } else {
        throw new RuntimeException(" Employee not found for id :: " + id);
    }
    return user;
}

	 
 
  
 
 
 
}