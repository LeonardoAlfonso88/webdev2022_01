package com.webdev.productsystem.Users.User.Domain.Ports;

import com.webdev.productsystem.Users.User.Domain.User;
import com.webdev.productsystem.Users.User.Domain.ValueObjects.UserEmail;

import java.util.List;

public interface UserRepository {
    public void save(User user);
    public User findByEmail(UserEmail email);
    public List<User> all();
}
