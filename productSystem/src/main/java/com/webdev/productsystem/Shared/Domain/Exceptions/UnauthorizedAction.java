package com.webdev.productsystem.Shared.Domain.Exceptions;

public class UnauthorizedAction extends RuntimeException {

    public UnauthorizedAction(String message) {
        super(message);
    }

}

