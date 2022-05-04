package com.webdev.productsystem.Users.User.Domain.ValueObjects;

import com.webdev.productsystem.Shared.Domain.Aggregate.DoubleValueObject;

public class UserRating extends DoubleValueObject {

    private UserRating() {}

    public UserRating(Double value) {
        validate(value);
        this.value = value;
    }

    private void validate(Double value) {
        allowedRatingValue(value);
    }

    private void allowedRatingValue(Double value) {
        if (value < 1 || value > 5) {
            throw new RuntimeException("La calificación debe estar entre 1 y 5");
        }
    }
}
