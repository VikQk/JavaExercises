package com.example.SpringLibrary.boot.repository;

import org.springframework.data.annotation.Id;
import org.springframework.data.repository.CrudRepository;
import com.example.SpringLibrary.boot.model.User;

public interface UserRepository extends CrudRepository<User, Id>{

}
