package com.webdev.productsystem.Users.User.Domain.ValueObjects;

import com.webdev.productsystem.Shared.Domain.Aggregate.CustomUUID;

public class UserId extends CustomUUID {
    public UserId(String value) {
        super(value);
    }
}
