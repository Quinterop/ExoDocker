package com.asy.fullstacktest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asy.fullstacktest.model.UserType;

@Repository
public interface UserTypeDAO extends JpaRepository<UserType, String>{
    UserType findByName(String name);
} 
    

