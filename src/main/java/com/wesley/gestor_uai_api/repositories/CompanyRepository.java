package com.wesley.gestor_uai_api.repositories;

import com.wesley.gestor_uai_api.domain.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyRepository extends JpaRepository<Company, UUID> {
}
