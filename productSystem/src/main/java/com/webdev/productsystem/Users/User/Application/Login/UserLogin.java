package com.webdev.productsystem.Users.User.Application.Login;

import com.webdev.productsystem.Shared.Application.TokenGeneration;
import com.webdev.productsystem.Shared.Application.TokenGenerationResponse;
import com.webdev.productsystem.Users.User.Domain.Exceptions.AuthenticateFailed;
import com.webdev.productsystem.Users.User.Domain.Ports.UserRepository;
import com.webdev.productsystem.Users.User.Domain.User;
import com.webdev.productsystem.Users.User.Domain.ValueObjects.UserEmail;
import com.webdev.productsystem.Users.User.Domain.ValueObjects.UserPassword;

import java.util.Optional;

public class UserLogin {

    private UserRepository repository;
    private final TokenGeneration tokenGeneration;

    public UserLogin(UserRepository repository, TokenGeneration tokenGeneration) {
        this.repository = repository;
        this.tokenGeneration = tokenGeneration;
    }

    public UserLoginResponse execute(String email, String password) {
        Optional<User> optionalUser = repository.findByEmail(new UserEmail(email));
        if(optionalUser.isEmpty()) {
            throw new AuthenticateFailed("Usuario no registrado.");
        }
        User user = optionalUser.get();
        user.authenticateUser(new UserEmail(email), new UserPassword(password));
        TokenGenerationResponse responseToken = this.tokenGeneration.execute(email);
        return new UserLoginResponse(email, responseToken.token());
    }
}
