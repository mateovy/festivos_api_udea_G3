package com.example.festivos_api.infrastructure.output.jpa.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import com.example.festivos_api.domain.model.Festivo;
import com.example.festivos_api.domain.spi.IFestivoPersistencePort;
import com.example.festivos_api.infrastructure.output.jpa.mapper.IFestivoEntityMapper;
import com.example.festivos_api.infrastructure.output.jpa.repository.IFestivoRepository;

import java.util.List;

@Component
@RequiredArgsConstructor
public class FestivoJpaAdapter implements IFestivoPersistencePort {

    private final IFestivoRepository festivoRepository;
    private final IFestivoEntityMapper festivoEntityMapper;

    @Override
    public List<Festivo> obtenerTodos() {
        return festivoEntityMapper.toFestivoList(festivoRepository.findAll());
    }
}
