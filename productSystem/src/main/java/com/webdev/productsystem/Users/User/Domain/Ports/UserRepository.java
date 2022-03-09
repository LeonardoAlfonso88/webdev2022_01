package com.webdev.productsystem.Users.User.Domain.Ports;

import com.webdev.productsystem.Users.User.Domain.User;
import com.webdev.productsystem.Users.User.Domain.ValueObjects.UserEmail;
import com.webdev.productsystem.Users.User.Domain.ValueObjects.UserId;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    void save(User user);
    void update(User user);
    Optional<User> find(UserId userId);
    User findByEmail(UserEmail email);
    Optional<List<User>> all();
    void delete(User user);
}
