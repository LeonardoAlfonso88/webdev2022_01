package com.webdev.productsystem.Users.User.Domain.ValueObjects;

import com.webdev.productsystem.Shared.Domain.Aggregate.StringValueObject;
import com.webdev.productsystem.Users.User.Domain.Exceptions.InvalidPassword;

public class UserPassword extends StringValueObject {

    private UserPassword() {}

    public UserPassword(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) {
        symbolContains(value);
    }

    private void symbolContains(String value) {
        if (!(value.contains("$") || value.contains("*"))) {
            throw new InvalidPassword("Simbolo no encontrado en la contraseña");
        }
    }
}
