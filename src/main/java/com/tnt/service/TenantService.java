package com.tnt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tnt.model.Tenant;
import com.tnt.repository.TenantRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TenantService {

    @Autowired
    private TenantRepository tenantRepository;

    public List<Tenant> findAll() {
        return tenantRepository.findAll();
    }

    public Optional<Tenant> findById(Long id) {
        return tenantRepository.findById(id);
    }

    public Tenant create(Tenant tenant) {
        return tenantRepository.save(tenant);
    }

    public Tenant update(Tenant tenant) {
        return tenantRepository.save(tenant);
    }

    public void deleteById(Long id) {
        tenantRepository.deleteById(id);
    }

    
}
