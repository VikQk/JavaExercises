package com.example.shopExempleManyToMany.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.shopExempleManyToMany.boot.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
