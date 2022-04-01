package com.webdev.productsystem.Users.Address.Domain.ValueObjects;

import com.webdev.productsystem.Shared.Domain.Aggregate.CustomUUID;

public class UserId extends CustomUUID {

    private UserId() {}

    public UserId(String value) {
        super(value);
    }

}
