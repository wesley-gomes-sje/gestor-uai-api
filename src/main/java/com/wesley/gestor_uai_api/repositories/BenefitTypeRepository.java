package com.wesley.gestor_uai_api.repositories;

import com.wesley.gestor_uai_api.domain.benefitType.BenefitType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BenefitTypeRepository extends JpaRepository<BenefitType, UUID> {
}
