package com.example.accessingdatajpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

    List<User> findByFirstName(String firstName);
    
    List<User> findByLastName(String lastName);

	User findByUserName(String userName);
}
