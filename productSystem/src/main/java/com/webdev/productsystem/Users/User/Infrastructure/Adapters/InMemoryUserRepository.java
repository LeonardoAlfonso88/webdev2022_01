package com.webdev.productsystem.Users.User.Infrastructure.Adapters;

import com.webdev.productsystem.Users.User.Domain.Ports.UserRepository;
import com.webdev.productsystem.Users.User.Domain.User;
import com.webdev.productsystem.Users.User.Domain.ValueObjects.UserEmail;
import com.webdev.productsystem.Users.User.Domain.ValueObjects.UserId;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class InMemoryUserRepository implements UserRepository {

    private List<User> users = new ArrayList<>();

    public void save(User user) {
        System.out.println("Estoy en el repo");
        System.out.println(user.data());
        users.add(user);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public Optional<User> find(UserId userId) {
        return Optional.empty();
    }

    @Override
    public User findByEmail(UserEmail email) {
        System.out.println(email.value());
        users.stream().forEach(user -> System.out.println(user.data().get("email")));
        return users.stream().filter(user -> user.data().get("email").equals(email.value())).collect(Collectors.toList()).get(0);
    }

    @Override
    public Optional<List<User>> all() {
        return Optional.ofNullable(users);
    }

    @Override
    public void delete(User user) {

    }

}
