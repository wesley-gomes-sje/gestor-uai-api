package com.wesley.gestor_uai_api.domain.position;

import com.wesley.gestor_uai_api.domain.company.Company;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table (name = "positions")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Position {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;
}
