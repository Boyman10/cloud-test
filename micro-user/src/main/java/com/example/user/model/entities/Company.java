package com.example.user.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import java.time.ZonedDateTime;
import java.util.Set;

@Entity
public class Company {

    @Id
    @GeneratedValue
    public Integer id;
    @NotBlank
    public String identification;
    @NotBlank
    public String name;
    public ZonedDateTime createdAt;

    @ManyToMany(mappedBy = "companies")
    public Set<User> users;
}
