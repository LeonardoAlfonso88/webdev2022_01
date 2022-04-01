package com.webdev.productsystem.Users.Address.Domain.ValueObjects;

import com.webdev.productsystem.Shared.Domain.Aggregate.CustomUUID;

public class AddressId extends CustomUUID {

    private AddressId() {}

    public AddressId(String value) {
        super(value);
    }

}
