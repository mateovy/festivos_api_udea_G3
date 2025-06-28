package com.example.festivos_api.aplicacion.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FestivoResponse {
    private String nombre;
    private int dia;
    private int mes;
}
