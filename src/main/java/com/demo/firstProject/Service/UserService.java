package com.demo.firstProject.Service;

import com.demo.firstProject.DTOs.Request.Response.UserRequest;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<?> Save(UserRequest userRequest);
}
