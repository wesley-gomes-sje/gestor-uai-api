package com.wesley.gestor_uai_api.repositories;

import com.wesley.gestor_uai_api.domain.position.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PositionRepository extends JpaRepository<Position, UUID> {
}
