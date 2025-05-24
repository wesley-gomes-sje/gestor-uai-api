package com.wesley.gestor_uai_api.domain.benefit;

import com.wesley.gestor_uai_api.domain.benefitType.BenefitType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "benefits")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Benefit {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private Integer value;

    @ManyToOne
    @JoinColumn(name = "benefit_type_id", referencedColumnName = "id")
    private BenefitType benefit_type;
}
