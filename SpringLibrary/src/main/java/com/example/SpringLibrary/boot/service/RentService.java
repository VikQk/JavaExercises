package com.example.SpringLibrary.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SpringLibrary.boot.model.Rent;
import com.example.SpringLibrary.boot.repository.RentRepository;

@Service
public class RentService {
	
	@Autowired
	RentRepository repository;
	
	public Iterable<Rent> findAll(){
		
		return repository.findAll();
	}

	public void insertRent(Rent rent) {
		
		repository.save(rent);
		//library.add(book);
	}
	
	public void deleteRent(Rent rent) {
		
		repository.delete(rent);
		//library.remove(book);
		
	}
}