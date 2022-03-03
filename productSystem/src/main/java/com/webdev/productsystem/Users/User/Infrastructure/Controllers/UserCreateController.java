package com.webdev.productsystem.Users.User.Infrastructure.Controllers;

import com.webdev.productsystem.Users.User.Application.Create.UserCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserCreateController {

    @Autowired
    private UserCreator creator;

    @PostMapping(value = "/create")
    public ResponseEntity execute(@RequestBody UserCreatorRequest request) {
        creator.execute(request.getId(), request.getName(), request.getEmail(), request.getPassword());
        return ResponseEntity.status(HttpStatus.CREATED).body(null);
    }


    static class UserCreatorRequest {
        private String id;
        private String name;
        private String email;
        private String password;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

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
