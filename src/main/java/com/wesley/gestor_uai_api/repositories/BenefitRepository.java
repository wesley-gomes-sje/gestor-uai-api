package com.wesley.gestor_uai_api.repositories;

import com.wesley.gestor_uai_api.domain.benefit.Benefit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BenefitRepository extends JpaRepository<Benefit, UUID> {
}
