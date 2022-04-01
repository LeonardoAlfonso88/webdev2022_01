package com.webdev.productsystem.Users.Address.Domain.ValueObjects;

import com.webdev.productsystem.Shared.Domain.Aggregate.StringValueObject;

public class AddressNeighborhood extends StringValueObject {

    private AddressNeighborhood() {}

    public AddressNeighborhood(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) {

    }

}
