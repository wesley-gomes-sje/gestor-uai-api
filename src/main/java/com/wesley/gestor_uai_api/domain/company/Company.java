package com.wesley.gestor_uai_api.domain.company;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table (name = "companies")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String document;
    private String email;
    private String phone;
    private String logo;
    private String address;
    private String city;
    private String state;
    private String country;
    private String zip_code;
}
