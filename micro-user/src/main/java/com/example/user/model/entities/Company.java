package com.example.user.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Entity
public class Company {

    @Id
    @GeneratedValue
    public Integer id;
    @NotNull
    public String identification;
    @NotNull
    public String name;
    public ZonedDateTime createdAt;
}
