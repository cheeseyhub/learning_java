package com.demo.UserRepository;

import org.springframework.data.repository.CrudRepository;

import com.demo.databasedemo.Entities.User;

public interface UserRepository extends CrudRepository<User,Integer>{
    
}
