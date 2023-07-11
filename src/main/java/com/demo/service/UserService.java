package com.demo.service;

import java.util.List;

import com.demo.entity.Userr;

public interface UserService 
{
    Userr save(Userr user);
    List<Userr>users();
}
