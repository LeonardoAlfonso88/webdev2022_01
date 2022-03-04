package com.webdev.productsystem.Users.User.Application.All;

import com.webdev.productsystem.Users.User.Domain.User;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class UserFindAllResponse {

    private List<User> users;

    public UserFindAllResponse(List<User> users) {
        this.users = users;
    }

    public List<HashMap<String, Object>> response() {
        List<HashMap<String, Object>> response = users.stream().map(user-> user.data()).collect(Collectors.toList());
        return response;
    }
}
