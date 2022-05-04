package com.webdev.productsystem.Users.Address.Domain.ValueObjects;

import com.webdev.productsystem.Shared.Domain.Aggregate.StringValueObject;

public class AddressDetail extends StringValueObject {

    private AddressDetail() {}

    public AddressDetail(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) {

    }

}
