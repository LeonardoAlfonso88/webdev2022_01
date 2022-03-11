package com.webdev.productsystem.Users.User.Domain.Exceptions;

public class InvalidUserEmail extends RuntimeException{
    public InvalidUserEmail(String message) {
        super(message);
    }
}
