package com.wesley.gestor_uai_api.domain.benefitType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "benefit_types")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BenefitType {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
}
