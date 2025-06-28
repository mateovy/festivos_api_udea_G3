package com.example.festivos_api.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "festivo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FestivoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;
    
    @Column(nullable = false)
    private int dia;

    @Column(nullable = false)
    private int mes;

    @Column(name = "diaspascua", nullable = false)
    private int diasPascua;

    @ManyToOne
    @JoinColumn(name = "idtipo", nullable = false)
    private TipoEntity tipo;
}

