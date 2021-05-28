package com.example.user.controllers;

import com.example.user.model.entities.Company;
import com.example.user.model.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;
import java.util.List;

@RestController
public class CompanyController {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @GetMapping(value = "/companies")
    @RolesAllowed("user")
    public List<Company> getAll() {
        return this.companyRepository.findAll();
    }

    @PostMapping(value = "/companies")
    @RolesAllowed("superadmin")
    public Company create(@Valid Company company) {
        return this.companyRepository.save(company);
    }
}
