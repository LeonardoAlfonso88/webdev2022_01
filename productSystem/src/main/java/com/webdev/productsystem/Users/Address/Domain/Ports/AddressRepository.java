package com.webdev.productsystem.Users.Address.Domain.Ports;

import com.webdev.productsystem.Users.Address.Domain.Address;
import com.webdev.productsystem.Users.Address.Domain.ValueObjects.AddressId;

import java.util.List;
import java.util.Optional;

public interface AddressRepository {
    void save(Address address);
    void update(Address address);
    Optional<Address> find(AddressId addressId);
    Optional<List<Address>> all();
    void delete(Address address);
}
