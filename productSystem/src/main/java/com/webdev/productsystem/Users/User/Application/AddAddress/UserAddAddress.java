package com.webdev.productsystem.Users.User.Application.AddAddress;

import com.webdev.productsystem.Users.User.Domain.Entities.UserAddress;
import com.webdev.productsystem.Users.User.Domain.Ports.UserRepository;
import com.webdev.productsystem.Users.User.Domain.User;
import com.webdev.productsystem.Users.User.Domain.ValueObjects.UserId;

import java.util.Optional;

public class UserAddAddress {

    private UserRepository repository;

    public UserAddAddress(UserRepository repository) {
        this.repository = repository;
    }

    public void execute(String userId, String id, String city, String postalCode, String detail, String info) {
        Optional<User> optionalUser = repository.find(new UserId(userId));
        if(optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.addAddress(new UserAddress(id, city, postalCode, detail, info));
            this.repository.update(user);
        }
    }
}
