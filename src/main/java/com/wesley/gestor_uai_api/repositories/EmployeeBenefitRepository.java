package com.wesley.gestor_uai_api.repositories;

import com.wesley.gestor_uai_api.domain.employeeBenefit.EmployeeBenefit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeeBenefitRepository extends JpaRepository<EmployeeBenefit, UUID> {
}
