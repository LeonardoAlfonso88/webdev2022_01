package com.webdev.productsystem.Users.User.Application.Login;

import com.webdev.productsystem.Users.User.Domain.Ports.UserRepository;
import com.webdev.productsystem.Users.User.Domain.User;
import com.webdev.productsystem.Users.User.Domain.ValueObjects.UserEmail;
import com.webdev.productsystem.Users.User.Domain.ValueObjects.UserPassword;

public class UserLogin {

    private UserRepository repository;

    public UserLogin(UserRepository repository) {
        this.repository = repository;
    }

    public void execute(String email, String password) {
        User user = repository.findByEmail(new UserEmail(email));
        user.authenticateUser(new UserEmail(email), new UserPassword(password));
    }
}
