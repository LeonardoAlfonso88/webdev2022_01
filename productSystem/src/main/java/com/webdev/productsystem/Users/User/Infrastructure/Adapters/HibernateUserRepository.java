package com.webdev.productsystem.Users.User.Infrastructure.Adapters;


import com.webdev.productsystem.Shared.Infrastruture.Hibernate.HibernateRepository;
import com.webdev.productsystem.Users.User.Domain.Ports.UserRepository;
import com.webdev.productsystem.Users.User.Domain.User;
import com.webdev.productsystem.Users.User.Domain.ValueObjects.UserEmail;
import com.webdev.productsystem.Users.User.Domain.ValueObjects.UserId;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional("transactional-manager")
public class HibernateUserRepository extends HibernateRepository<User> implements UserRepository {

    public HibernateUserRepository(@Qualifier("session-factory") SessionFactory sessionFactory) {
        super(sessionFactory, User.class);
    }

    @Override
    public void save(User user) {
        persist(user);
    }

    @Override
    public void update(User user) {
        updateEntity(user);
    }

    @Override
    public Optional<User> find(UserId userId) {
        return byId(userId);
    }

    @Override
    public User findByEmail(UserEmail email) {
        return null;
    }

    @Override
    public Optional<List<User>> all() {
        return getAll();
    }

    @Override
    public void delete(User user) {
        deleteEntity(user);
    }
}
