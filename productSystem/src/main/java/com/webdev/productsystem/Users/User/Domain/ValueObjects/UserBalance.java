package com.webdev.productsystem.Users.User.Domain.ValueObjects;

import com.webdev.productsystem.Shared.Domain.Aggregate.DoubleValueObject;

public class UserBalance extends DoubleValueObject {

    public UserBalance(Double value) {
        validate(value);
        this.value = value;
    }

    private void validate(Double value) {
        notNegativeValue(value);
    }

    private void notNegativeValue(Double value) {
        if (value < 0) {
            throw new RuntimeException("El saldo no puede ser negativo");
        }
    }
}
