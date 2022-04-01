package com.webdev.productsystem.Users.Address.Domain.ValueObjects;

import com.webdev.productsystem.Shared.Domain.Aggregate.StringValueObject;

public class AddressPostalCode extends StringValueObject {

    private AddressPostalCode() {}

    public AddressPostalCode(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) {

    }

}
