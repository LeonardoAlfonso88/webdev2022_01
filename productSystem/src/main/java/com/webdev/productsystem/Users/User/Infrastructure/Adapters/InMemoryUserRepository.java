package com.webdev.productsystem.Users.User.Infrastructure.Adapters;

import com.webdev.productsystem.Users.User.Domain.Ports.UserRepository;
import com.webdev.productsystem.Users.User.Domain.User;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserRepository implements UserRepository {

    private List<User> users = new ArrayList<>();

    public void save(User user) {
        users.add(user);
    }

    public List<User> all() {
        return users;
    }
}
