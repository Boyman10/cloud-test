package com.example.user.model.entities;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.security.Principal;
import java.time.ZonedDateTime;
import java.util.Set;

@Entity
@Table(name = "`micro_user`")
public class User implements Principal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @NotBlank
    public String userName;
    @Email
    public String email;
    public String firstName;
    public String lastName;
    @CreatedDate
    public ZonedDateTime createdAt;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "micro_user_company",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "company_id"))
    public Set<Company> companies;

    @Override
    public String getName() {
        return String.join(" ", firstName, lastName);
    }
}
