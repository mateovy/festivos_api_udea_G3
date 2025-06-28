package com.example.festivos_api.domain.spi;

import com.example.festivos_api.domain.model.Festivo;
import java.util.List;

public interface IFestivoPersistencePort {
    List<Festivo> obtenerTodos();
}