package com.demo.firstProject.DTOs.Request.Response;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {


    private String name;


    private String email;

    private String phoneNumber;

    private String message;
}
