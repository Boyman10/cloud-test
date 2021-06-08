package com.example.user.model.entities;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.ZonedDateTime;
import java.util.Set;

@Entity
@Table(name = "`micro_company`")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    @NotBlank
    public String identification;
    @NotBlank
    public String name;
    @CreatedDate
    public ZonedDateTime createdAt;

    @ManyToMany(mappedBy = "companies")
    public Set<User> users;
}
