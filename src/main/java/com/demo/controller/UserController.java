package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Userr;
import com.demo.service.UserService;

@RestController
public class UserController 
{
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<Userr>saveUser(@RequestBody Userr user)
    {
        return new ResponseEntity<>(userService.save(user),HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public ResponseEntity<List<Userr>>getUsers()
    {
        return new ResponseEntity<>(userService.users(),HttpStatus.OK);
    }
    
}
