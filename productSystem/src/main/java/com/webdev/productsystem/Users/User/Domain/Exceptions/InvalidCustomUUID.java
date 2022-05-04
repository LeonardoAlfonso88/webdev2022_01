package com.webdev.productsystem.Users.User.Domain.Exceptions;

public class InvalidCustomUUID extends RuntimeException{
    public InvalidCustomUUID(String message) {
        super(message);
    }
}
