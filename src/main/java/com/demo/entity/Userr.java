package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Userr
{
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String password;
}
