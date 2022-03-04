package com.webdev.productsystem.Users.User.Infrastructure.Adapters;

import com.webdev.productsystem.Users.User.Domain.Ports.UserRepository;
import com.webdev.productsystem.Users.User.Domain.User;
import com.webdev.productsystem.Users.User.Domain.ValueObjects.UserEmail;

import java.util.ArrayList;
import java.util.List;

public class MariaDBUserRepository implements UserRepository {

    private List<User> users = new ArrayList<>();

    public void save(User user) {
        //Conectarse a la DB
        //Mappings
        //COnfirmar transacción en DB
    }

    @Override
    public User findByEmail(UserEmail email) {
        return null;
    }

    public List<User> all() {
        return users;
    }
}
