package com.webdev.productsystem.Users.User.Domain.Ports;

import com.webdev.productsystem.Users.User.Domain.User;

public interface UserSenderEmail {
    public void Send(User user);
}
