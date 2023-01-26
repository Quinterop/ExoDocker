package com.asy.fullstacktest.service;

import java.util.List;

import com.asy.fullstacktest.model.User;
import com.asy.fullstacktest.model.UserType;

public interface EntityService {
    //to trim

    User findByEmail(String email);

    User findByName(String name);

    User findByFirstName(String firstName);

    User findByType(UserType type);

    User save(User user);

    void delete(User user);

    void deleteById(int id);

    Iterable<User> findAll();

    long count();

    User findById(int id);

    boolean existsById(int id);

    List<UserType> findAllUserTypes();

    UserType save(UserType type);

    void delete(UserType type);

    UserType findTypeByName(String name);

    void update(int id, User user);

    void update(String name, UserType type);

}
