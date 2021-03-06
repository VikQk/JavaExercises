package com.example.SpringLibrary.boot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SpringLibrary.boot.model.User;
import com.example.SpringLibrary.boot.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	public Iterable<User> findAll(){
		
		return repository.findAll();
	}
	
	public void insertUser(User user) {
		repository.save(user);
	}

	public void deleteUser(User user) {
		
		repository.delete(user);		
	}
	public Optional<User> findById (long id) {

		return repository.findById(id);
	}
}
