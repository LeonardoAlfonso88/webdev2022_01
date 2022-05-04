package com.webdev.productsystem.Users.User.Domain.Exceptions;

public class InvalidPassword extends RuntimeException{
    public InvalidPassword(String message) {
        super(message);
    }
}
