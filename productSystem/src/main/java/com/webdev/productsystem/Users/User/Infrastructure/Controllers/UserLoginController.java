package com.webdev.productsystem.Users.User.Infrastructure.Controllers;

import com.webdev.productsystem.Shared.Infrastruture.Schema.ErrorSchema;
import com.webdev.productsystem.Users.User.Application.Login.UserLogin;
import com.webdev.productsystem.Users.User.Application.Login.UserLoginResponse;
import com.webdev.productsystem.Users.User.Domain.Exceptions.AuthenticateFailed;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@Tag(name = "User", description = "User REST API")
@RequestMapping(value = "/user")
public class UserLoginController {

    @Autowired
    private UserLogin login;

    @Operation(summary = "Authenticated a User", description = "Authenticated a User in the system", tags = {"User"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Authenticated in the system"),
            @ApiResponse(responseCode = "401", description = "Unauthorized user", content = @Content(schema = @Schema(implementation = ErrorSchema.class))),
    })
    @PostMapping(value = "/login")
    public ResponseEntity<HashMap<String, Object>> execute(@RequestBody UserLoginRequest request) {
        UserLoginResponse response = login.execute(request.getEmail(), request.getPassword());
        return ResponseEntity.status(HttpStatus.OK).body(response.response());
    }

    @ExceptionHandler(AuthenticateFailed.class)
    @ResponseStatus(code = HttpStatus.UNAUTHORIZED)
    public ResponseEntity<HashMap> handleFailedAuthenticated(RuntimeException exception) {
        HashMap<String, String> response = new HashMap<>() {{
            put("error", exception.getMessage());
        }};
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
    }

    static class UserLoginRequest {

        @Schema(description = "User email, contains @", example = "gustavo.salazar@gmail.com")
        private String email;

        @Schema(description = "User password, contains $ and/or *", example = "Password123$*")
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
