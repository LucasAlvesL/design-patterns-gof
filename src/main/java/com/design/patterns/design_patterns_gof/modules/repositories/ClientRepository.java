package com.design.patterns.design_patterns_gof.modules.repositories;

import com.design.patterns.design_patterns_gof.modules.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
