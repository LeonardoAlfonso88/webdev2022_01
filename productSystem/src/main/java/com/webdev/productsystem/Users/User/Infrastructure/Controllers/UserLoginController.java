package com.webdev.productsystem.Users.User.Infrastructure.Controllers;

import com.webdev.productsystem.Users.User.Application.Create.UserCreator;
import com.webdev.productsystem.Users.User.Application.Login.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserLoginController {

    @Autowired
    private UserLogin login;

    @PostMapping(value = "/login")
    public ResponseEntity execute(@RequestBody UserLoginRequest request) {
        System.out.println(request);
        login.execute(request.getEmail(), request.getPassword());
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    static class UserLoginRequest {

        private String email;
        private String password;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
