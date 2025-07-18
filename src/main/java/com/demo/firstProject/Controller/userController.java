package com.demo.firstProject.Controller;


import com.demo.firstProject.DTOs.Request.Response.UserRequest;
import com.demo.firstProject.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class userController {
    private final UserService userService;

    public userController(UserService userService){
        this.userService=userService;
    }

    @PostMapping("/send/message")
    public ResponseEntity<?> createUserWithMessage(@RequestBody UserRequest userRequest){
        return userService.Save(userRequest);
    }
}
