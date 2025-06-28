package com.example.festivos_api.infrastructure.output.jpa.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.example.festivos_api.domain.model.Tipo;
import com.example.festivos_api.infrastructure.output.jpa.entity.TipoEntity;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITipoEntityMapper {
    TipoEntity toEntity(Tipo tipo);
    Tipo toTipo(TipoEntity tipoEntity);
}
