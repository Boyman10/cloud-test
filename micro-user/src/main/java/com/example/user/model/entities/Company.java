package com.example.user.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.ZonedDateTime;

@Entity
public class Company {

    @Id
    @GeneratedValue
    public Integer id;
    public String name;
    public ZonedDateTime createdAt;
}
