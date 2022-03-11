package com.webdev.productsystem.Users.User.Application.All;

import com.webdev.productsystem.Users.User.Domain.Ports.UserRepository;
import com.webdev.productsystem.Users.User.Domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserFindAll {

    private UserRepository repository;

    public UserFindAll(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> execute() {
        List<User> users = new ArrayList<User>();
        Optional<List<User>> optionalUsers = repository.all();
        if(optionalUsers.isPresent()) {
            users = optionalUsers.get();
        }
        return users;
    }
}
