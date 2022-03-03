package com.webdev.productsystem.Users.User.Application.All;

import com.webdev.productsystem.Users.User.Domain.Ports.UserRepository;
import com.webdev.productsystem.Users.User.Domain.User;

import java.util.List;

public class UserFindAll {

    private UserRepository repository;

    public UserFindAll(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> execute() {
        return repository.all();
    }
}
