package com.webdev.productsystem.Users.User.Domain.ValueObjects;

import com.webdev.productsystem.Shared.Domain.Aggregate.StringValueObject;
import com.webdev.productsystem.Users.User.Domain.Exceptions.InvalidUserEmail;

public class UserEmail extends StringValueObject {

    private UserEmail() {}

    public UserEmail(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) {
        emailFormat(value);
    }

    private void emailFormat(String value) {
        if (!value.contains("@")) {
            throw new InvalidUserEmail("Email sin @");
        }
    }
}
