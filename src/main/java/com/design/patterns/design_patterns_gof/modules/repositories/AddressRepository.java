package com.design.patterns.design_patterns_gof.modules.repositories;

import com.design.patterns.design_patterns_gof.modules.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {
}
