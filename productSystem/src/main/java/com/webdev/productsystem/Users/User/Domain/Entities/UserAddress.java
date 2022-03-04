package com.webdev.productsystem.Users.User.Domain.Entities;

import java.util.HashMap;

public class UserAddress {

    private String city;
    private Integer postalCode;
    private String detail;
    private String info;

    public UserAddress(String city, Integer postalCode, String detail, String info) {
        this.city = city;
        this.postalCode = postalCode;
        this.detail = detail;
        this.info = info;
    }

    public HashMap<String, Object> data() {
        HashMap<String, Object> data = new HashMap<>() {{
            put("city", city);
            put("postalCode", postalCode);
            put("detail", detail);
            put("info", info);
        }};
        return data;
    }
}
