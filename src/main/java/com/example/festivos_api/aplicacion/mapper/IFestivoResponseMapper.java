package com.example.festivos_api.aplicacion.mapper;


import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.example.festivos_api.aplicacion.dto.FestivoResponse;
import com.example.festivos_api.domain.model.Festivo;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IFestivoResponseMapper {
    FestivoResponse toResponse(Festivo festivo);
    List<FestivoResponse> toResponseList(List<Festivo> festivoList);
}
