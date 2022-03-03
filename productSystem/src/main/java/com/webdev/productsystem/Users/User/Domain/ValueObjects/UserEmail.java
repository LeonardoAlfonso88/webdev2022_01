package com.webdev.productsystem.Users.User.Domain.ValueObjects;

import com.webdev.productsystem.Shared.Domain.Aggregate.StringValueObject;

public class UserEmail extends StringValueObject {

    public UserEmail(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) {
        emailFormat(value);
    }

    private void emailFormat(String value) {
        if (!value.contains("@")) {
            throw new RuntimeException("Email sin @");
        }
    }
}
