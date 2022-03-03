package com.webdev.productsystem.Users.User.Domain.ValueObjects;

import com.webdev.productsystem.Shared.Domain.Aggregate.StringValueObject;
import com.webdev.productsystem.Users.User.Domain.Exceptions.LenghtInvalid;

public class UserName extends StringValueObject {

    public UserName(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) {
        lengthValue(value);
        notAllowedCharacters(value);
    }

    private void lengthValue(String value) {
        if (value.length() < 5 || value.length() > 30) {
            throw new LenghtInvalid("Longitud Invalida");
        }
    }

    private void notAllowedCharacters(String value) {}

}
