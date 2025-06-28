package com.example.festivos_api.domain.model;

public class Tipo {
    private Long id;
    private String tipo;

    public Tipo(Long id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
