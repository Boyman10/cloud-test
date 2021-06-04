package com.example.user.model.entities;

import javax.persistence.*;
import java.security.Principal;
import java.time.ZonedDateTime;
import java.util.Set;

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

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "user_companies",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "company_id"))
    public Set<Company> companies;

    @Override
    public String getName() {
        return String.join(" ", firstName, lastName);
    }
}
