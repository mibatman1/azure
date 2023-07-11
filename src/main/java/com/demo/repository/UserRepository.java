package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Userr;

public interface UserRepository extends JpaRepository<Userr,Integer> 
{
    
}
