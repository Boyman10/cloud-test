package com.example.user.model.entities;

import javax.persistence.*;
import java.security.Principal;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Table(name = "`micro_user`")
public class User implements Principal {

    @Id
    @GeneratedValue
    public Integer id;

    public String userName;
    public String firstName;
    public String lastName;
    public ZonedDateTime createdAt;

    @OneToMany
    public List<Company> companies;

    @Override
    public String getName() {
        return String.join(" ", firstName, lastName);
    }
}
