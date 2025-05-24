package com.wesley.gestor_uai_api.domain.employeeBenefit;

import com.wesley.gestor_uai_api.domain.benefit.Benefit;
import com.wesley.gestor_uai_api.domain.employee.Employee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Table (name = "employee_benefits")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeBenefit {
    @Id
    @GeneratedValue
    private UUID id;
    private LocalDate startDate;
    private boolean active;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "benefit_id", referencedColumnName = "id")
    private Benefit benefit;
}
