package com.example.festivos_api.infrastructure.output.jpa.mapper;

import com.example.festivos_api.domain.model.Festivo;
import com.example.festivos_api.infrastructure.output.jpa.entity.FestivoEntity;


import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        uses = {ITipoEntityMapper.class})
public interface IFestivoEntityMapper {
    FestivoEntity toEntity(Festivo festivo);
    Festivo toFestivo(FestivoEntity festivoEntity);
    List<Festivo> toFestivoList(List<FestivoEntity> festivoEntityList);
}
