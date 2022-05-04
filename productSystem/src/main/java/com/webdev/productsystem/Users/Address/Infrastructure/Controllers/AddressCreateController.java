package com.webdev.productsystem.Users.Address.Infrastructure.Controllers;

import com.webdev.productsystem.Shared.Infrastruture.Schema.ErrorSchema;
import com.webdev.productsystem.Users.Address.Application.Create.AddressCreator;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Address", description = "Address REST API")
@RequestMapping(value = "/address")
public class AddressCreateController {

    @Autowired
    private AddressCreator creator;

    @Operation(summary = "Create a new Address", description = "Create a new Address in the system", tags = {"Address"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Address created"),
            @ApiResponse(responseCode = "400", description = "Invalid input", content = @Content(schema = @Schema(implementation = ErrorSchema.class)))
    })
    @PostMapping(value = "/create")
    public ResponseEntity execute(@RequestBody AddressCreatorRequest request) {
        creator.execute(request.getId(), request.getCity(), request.getDetail(),
                request.getAdditionalInfo(), request.getPostalCode(), request.getNeighborhood(),
                request.getUserId());
        return ResponseEntity.status(HttpStatus.CREATED).body(null);
    }

    static class AddressCreatorRequest {
        @Schema(description = "Address id", example = "564af8a6-a7ea-4733-acff-d2e5aada4e5a")
        private String id;

        @Schema(description = "Address city", example = "Bogotá")
        private String city;

        @Schema(description = "Address detail", example = "Calle 106 # 22 - 45")
        private String detail;

        @Schema(description = "Address additionalInfo", example = "Edificio Torre Verde Apto 701")
        private String additionalInfo;

        @Schema(description = "Address postalCode", example = "110151")
        private String postalCode;

        @Schema(description = "Address neighborhood", example = "Navarra")
        private String neighborhood;

        @Schema(description = "UserId", example = "0f1c4b36-e610-4446-a3a3-a6083902b587")
        private String userId;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public String getAdditionalInfo() {
            return additionalInfo;
        }

        public void setAdditionalInfo(String additionalInfo) {
            this.additionalInfo = additionalInfo;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public void setPostalCode(String postalCode) {
            this.postalCode = postalCode;
        }

        public String getNeighborhood() {
            return neighborhood;
        }

        public void setNeighborhood(String neighborhood) {
            this.neighborhood = neighborhood;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }
    }
}
