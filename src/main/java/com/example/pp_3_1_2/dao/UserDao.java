package com.example.pp_3_1_2.dao;

import com.example.pp_3_1_2.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void removeUserByID(long id);

    List<User> getAllUsers();

    void editUsers(User user);

    User getUser(long id);

}
