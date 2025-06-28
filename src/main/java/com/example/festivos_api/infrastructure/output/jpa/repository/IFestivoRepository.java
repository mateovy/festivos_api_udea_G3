package com.example.festivos_api.infrastructure.output.jpa.repository;

import com.example.festivos_api.infrastructure.output.jpa.entity.FestivoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFestivoRepository extends JpaRepository<FestivoEntity, Long> {
}
