package com.example.festivos_api.aplicacion.handler;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.festivos_api.aplicacion.dto.FestivoResponse;
import com.example.festivos_api.aplicacion.mapper.IFestivoResponseMapper;
import com.example.festivos_api.domain.model.Festivo;
import com.example.festivos_api.domain.spi.IFestivoPersistencePort;
import com.example.festivos_api.domain.spi.IFestivoServicePort;



@Service // Indica que es un servicio de aplicación
@Transactional // Generalmente los casos de uso son transaccionales
public class FestivoHandler implements IFestivoServicePort {

    private final IFestivoPersistencePort festivoPersistencePort;
    private final IFestivoResponseMapper festivoResponseMapper;

    public FestivoHandler(IFestivoPersistencePort festivoPersistencePort, IFestivoResponseMapper festivoResponseMapper) {
        this.festivoPersistencePort = festivoPersistencePort;
        this.festivoResponseMapper = festivoResponseMapper;
    }

    @Override
    public List<Festivo> obtenerTodos() {
        return this.festivoPersistencePort.obtenerTodos();
    }
    
    // Podríamos añadir métodos extra que usen el mapper para devolver DTOs
    public List<FestivoResponse> obtenerTodosResponse() {
        return festivoResponseMapper.toResponseList(this.festivoPersistencePort.obtenerTodos());
    }
}
