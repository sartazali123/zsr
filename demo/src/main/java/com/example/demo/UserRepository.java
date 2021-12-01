package com.example.demo;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	void deleteById(long id);

	void getById(long id);

	Optional<User> findById(long id);
	
}


