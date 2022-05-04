package com.webdev.productsystem.Users.Address.Domain.ValueObjects;

import com.webdev.productsystem.Shared.Domain.Aggregate.StringValueObject;

public class AddressAdditionalInfo extends StringValueObject {

    private AddressAdditionalInfo() {}

    public AddressAdditionalInfo(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) {

    }

}
