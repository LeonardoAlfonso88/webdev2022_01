package com.webdev.productsystem.Users.User.Domain.Exceptions;

public class AuthenticateFailed extends RuntimeException{
    public AuthenticateFailed(String message) {
        super(message);
    }
}
