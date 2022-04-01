package com.webdev.productsystem.Users.User.Infrastructure.Listeners;

import com.webdev.productsystem.Users.Address.Domain.DomainEvents.AddressCreatedDomainEvent;
import com.webdev.productsystem.Users.User.Application.AddAddress.UserAddAddress;

public final class AddAddressOnCreatedAddress {

    private UserAddAddress adder;

    public AddAddressOnCreatedAddress(UserAddAddress adder) {
        this.adder = adder;
    }

    public void on(AddressCreatedDomainEvent event) {
        this.adder.execute(event.getUserId(), event.aggregateId(),
                event.getCity(), event.getPostalCode(), event.getDetail(), event.getInfo());
    }

}
