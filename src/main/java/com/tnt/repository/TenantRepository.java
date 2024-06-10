package com.tnt.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tnt.model.Tenant;

public interface TenantRepository  extends JpaRepository<Tenant,Long>{
    
}
