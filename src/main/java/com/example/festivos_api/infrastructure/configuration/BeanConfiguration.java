package com.example.festivos_api.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.festivos_api.aplicacion.handler.FestivoHandler;
import com.example.festivos_api.aplicacion.mapper.IFestivoResponseMapper;
import com.example.festivos_api.domain.spi.IFestivoPersistencePort;
import com.example.festivos_api.domain.spi.IFestivoServicePort;
import com.example.festivos_api.infrastructure.output.jpa.adapter.FestivoJpaAdapter;
import com.example.festivos_api.infrastructure.output.jpa.mapper.IFestivoEntityMapper;
import com.example.festivos_api.infrastructure.output.jpa.repository.IFestivoRepository;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    
    /* Esta sección puede no ser necesaria si usamos la inyección de dependencias
       directa con @Service y @Component, pero es una forma explícita de declarar los beans
       y muy fiel al patrón de inversión de control. El proyecto de ejemplo no lo usa, 
       así que puedes optar por dejarla o quitarla. Con fines didácticos, la dejo. */

    private final IFestivoRepository festivoRepository;
    private final IFestivoEntityMapper festivoEntityMapper;
    private final IFestivoResponseMapper festivoResponseMapper;

    @Bean
    public IFestivoPersistencePort festivoPersistencePort() {
        return new FestivoJpaAdapter(festivoRepository, festivoEntityMapper);
    }
    
    @Bean
    public IFestivoServicePort festivoServicePort(){
        return new FestivoHandler(festivoPersistencePort(), festivoResponseMapper);
    }
}
