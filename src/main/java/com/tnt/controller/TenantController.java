package com.tnt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.tnt.model.Tenant;
import com.tnt.service.TenantService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/companies")
public class TenantController {

    @Autowired
    private TenantService tenantService;

    @GetMapping
    public List<Tenant> findAll() {
        return tenantService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Tenant> findById(@PathVariable Long id) {
        return tenantService.findById(id);
    }

    // create a book
    @ResponseStatus(HttpStatus.CREATED) // 201
    @PostMapping
    public Tenant create(@RequestBody Tenant tenant) {
        return tenantService.create(tenant);
    }

    // update a book
    @PutMapping
    public Tenant update(@RequestBody Tenant tenant) {
        return tenantService.update(tenant);
    }

    // delete a book
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        tenantService.deleteById(id);
    }


}
