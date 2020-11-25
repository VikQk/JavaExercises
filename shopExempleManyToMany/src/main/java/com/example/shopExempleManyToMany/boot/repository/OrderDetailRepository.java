package com.example.shopExempleManyToMany.boot.repository;



import org.springframework.data.repository.CrudRepository;

import com.example.shopExempleManyToMany.boot.model.OrderDetail;

public interface OrderDetailRepository extends CrudRepository<OrderDetail, Long> {

}
