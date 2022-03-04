package com.webdev.productsystem.Users.User.Infrastructure.Adapters;

import com.webdev.productsystem.Users.User.Domain.Ports.UserSenderEmail;
import com.webdev.productsystem.Users.User.Domain.User;

public class RailMailUserSenderEmail implements UserSenderEmail {
    @Override
    public void Send(User user) {

    }
}
