package com.demo.firstProject.DTOs.Request.Response;

import lombok.Data;

@Data

public class UserResponse {

    private String message;

    public UserResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
