package com.example.pp_3_1_2.service;

import com.example.pp_3_1_2.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    void editUser(User user);

    User getUser(long id);
}
