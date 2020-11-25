package com.example.shopExempleManyToMany.boot.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.shopExempleManyToMany.boot.model.CreditCard;


public interface CreditCardRepository extends CrudRepository<CreditCard, Long> {

	CreditCard findById(long id);
}