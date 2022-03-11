package com.webdev.productsystem.Users.User.Domain;

import com.webdev.productsystem.Users.User.Domain.Entities.UserAddress;
import com.webdev.productsystem.Users.User.Domain.Exceptions.AuthenticateFailed;
import com.webdev.productsystem.Users.User.Domain.ValueObjects.*;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class User {

    private UserId userId;
    private UserName userName;
    private UserEmail userEmail;
    private UserIsSeller isSeller;
    private UserBalance balance;
    private UserRating rating;
    private UserPassword password;
    private Optional<List<UserAddress>> addressList;

    public User(UserId userId, UserName userName, UserEmail userEmail, UserIsSeller isSeller, UserBalance balance, UserRating rating, UserPassword password,
                Optional<List<UserAddress>> addressList) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.isSeller = isSeller;
        this.balance = balance;
        this.rating = rating;
        this.password = password;
        this.addressList = addressList;
    }

    public static User create(UserId userId, UserName userName, UserEmail userEmail, UserPassword password) {
        User user = new User(userId,
                            userName,
                            userEmail,
                            new UserIsSeller(false),
                            new UserBalance(0d),
                            new UserRating(5d),
                            password, Optional.empty());
        return user;
    }

    public void authenticateUser(UserEmail userEmail, UserPassword password) {
        if (!(this.password.equals(password) && this.userEmail.equals(userEmail))) {
            throw new AuthenticateFailed("Credenciales inválidas");
        }
    }

    public HashMap<String, Object> data() {
        HashMap<String, Object> data = new HashMap<>() {{
            put("id", userId.value());
            put("name", userName.value());
            put("email", userEmail.value());
            put("isSeller", isSeller.value());
            put("balance", balance.value());
            put("rating", rating.value() * 20);
            put("address", createAddress());
        }};
        return data;
    }

    private List<HashMap<String, Object>> createAddress() {
        List<HashMap<String, Object>> list = new ArrayList<>();
        if (!addressList.isEmpty()) {
            list = addressList.get().stream().map(address -> address.data()).collect(Collectors.toList());
        }
        return list;
    }

    private User() {
        addressList = Optional.empty();
    }
}
