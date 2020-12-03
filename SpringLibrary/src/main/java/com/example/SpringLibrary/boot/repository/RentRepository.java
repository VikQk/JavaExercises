package com.example.SpringLibrary.boot.repository;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;
import com.example.SpringLibrary.boot.model.Rent;

public interface RentRepository extends CrudRepository<Rent, Long>{

	
}
