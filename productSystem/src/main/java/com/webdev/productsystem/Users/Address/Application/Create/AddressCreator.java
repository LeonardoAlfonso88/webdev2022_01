package com.webdev.productsystem.Users.Address.Application.Create;

import com.webdev.productsystem.Shared.Domain.Bus.Event.EventBus;
import com.webdev.productsystem.Users.Address.Domain.Address;
import com.webdev.productsystem.Users.Address.Domain.Ports.AddressRepository;
import com.webdev.productsystem.Users.Address.Domain.ValueObjects.*;

public class AddressCreator {

    private final AddressRepository repository;
    private final EventBus eventBus;

    public AddressCreator(AddressRepository repository, EventBus eventBus) {
        this.repository = repository;
        this.eventBus = eventBus;
    }

    public void execute(String id, String city, String detail, String additionalInfo,
                        String postalCode, String neighborhood, String userId) {
        Address address = Address.create(new AddressId(id), new AddressCity(city), new AddressDetail(detail),
                new AddressAdditionalInfo(additionalInfo), new AddressPostalCode(postalCode),
                new AddressNeighborhood(neighborhood), new UserId(userId));
        this.repository.save(address);
        this.eventBus.publish(address.pullDomainEvents());
    }
}
