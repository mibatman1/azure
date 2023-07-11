package com.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Userr;
import com.demo.repository.UserRepository;
import com.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService 
{
    @Autowired
    private UserRepository userRepository;

    @Override
    public Userr save(Userr user) 
    {
        return userRepository.save(user);
    }

    @Override
    public List<Userr> users() 
    {
        return userRepository.findAll();
    }
}
