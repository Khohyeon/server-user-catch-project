package com.side.serverusercatchproject.repository;

import com.side.serverusercatchproject.entity.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EnterpriseRepository extends JpaRepository<Enterprise, Integer> {
    Optional<Enterprise> findByUsername(String username);
}
