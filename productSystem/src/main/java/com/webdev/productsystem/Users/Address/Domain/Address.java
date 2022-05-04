package com.webdev.productsystem.Users.Address.Domain;

import com.webdev.productsystem.Shared.Domain.Aggregate.AggregateRoot;
import com.webdev.productsystem.Users.Address.Domain.DomainEvents.AddressCreatedDomainEvent;
import com.webdev.productsystem.Users.Address.Domain.ValueObjects.*;

import java.util.HashMap;

public class Address extends AggregateRoot {

    private AddressId id;
    private AddressCity city;
    private AddressDetail detail;
    private AddressAdditionalInfo additionalInfo;
    private AddressPostalCode postalCode;
    private AddressNeighborhood neighborhood;
    private UserId userId;

    public Address(AddressId id, AddressCity city, AddressDetail detail,
                   AddressAdditionalInfo additionalInfo, AddressPostalCode postalCode,
                   AddressNeighborhood neighborhood, UserId userId) {
        this.id = id;
        this.city = city;
        this.detail = detail;
        this.additionalInfo = additionalInfo;
        this.postalCode = postalCode;
        this.neighborhood = neighborhood;
        this.userId = userId;
    }

    public static Address create(AddressId id, AddressCity city, AddressDetail detail,
                                 AddressAdditionalInfo additionalInfo, AddressPostalCode postalCode,
                                 AddressNeighborhood neighborhood, UserId userId) {
        Address address = new Address(id, city, detail, additionalInfo, postalCode, neighborhood, userId);
        address.record(new AddressCreatedDomainEvent(id.value(), city.value(), postalCode.value(),
                detail.value(), additionalInfo.value(), userId.value()));
        return address;
    }

    public HashMap<String, Object> data() {
        HashMap<String, Object> data = new HashMap<>() {{
            put("id", id.value());
            put("city", city.value());
            put("detail", detail.value());
            put("additionalInfo", additionalInfo.value());
            put("postalCode", postalCode.value());
            put("neighborhood", neighborhood.value());
            put("userId", userId.value());
        }};
        return data;
    }

    private Address() {}

}
