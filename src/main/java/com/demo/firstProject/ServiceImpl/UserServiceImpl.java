package com.demo.firstProject.ServiceImpl;

import com.demo.firstProject.DTOs.Request.Response.UserRequest;
import com.demo.firstProject.Entity.UserEntity;
import com.demo.firstProject.Repository.UserRepository;
import com.demo.firstProject.Service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;

    }

    @Override
    public ResponseEntity<?> Save(UserRequest userRequest){
        UserEntity user=new UserEntity();
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        user.setPhoneNumber(userRequest.getPhoneNumber());
        user.setMessage(userRequest.getMessage());

        userRepository.save(user);
        return ResponseEntity.ok("User saved successfully");


    }

}
