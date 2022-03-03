package com.webdev.productsystem.Users.User.Application.Create;

import com.webdev.productsystem.Users.User.Domain.Ports.UserRepository;
import com.webdev.productsystem.Users.User.Domain.User;
import com.webdev.productsystem.Users.User.Domain.ValueObjects.UserEmail;
import com.webdev.productsystem.Users.User.Domain.ValueObjects.UserId;
import com.webdev.productsystem.Users.User.Domain.ValueObjects.UserName;
import com.webdev.productsystem.Users.User.Domain.ValueObjects.UserPassword;

public class UserCreator {

    private UserRepository repository;

    public UserCreator(UserRepository repository) {
        this.repository = repository;
    }

    public void execute(String userId, String userName, String userEmail, String password) {
        User user = User.create(new UserId(userId), new UserName(userName),
                                new UserEmail(userEmail), new UserPassword(password));
        repository.save(user);
    }
}
