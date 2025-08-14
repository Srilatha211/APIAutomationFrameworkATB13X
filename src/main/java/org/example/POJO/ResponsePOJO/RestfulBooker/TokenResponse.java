package org.example.POJO.ResponsePOJO.RestfulBooker;

import com.google.gson.annotations.Expose;

public class TokenResponse {

    @Expose
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}