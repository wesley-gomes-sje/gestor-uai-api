package com.wesley.gestor_uai_api.repositories;

import com.wesley.gestor_uai_api.domain.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
}
