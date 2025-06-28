package com.example.festivos_api.infrastructure.input;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.festivos_api.aplicacion.dto.FestivoResponse;
import com.example.festivos_api.aplicacion.handler.FestivoHandler;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/festivos")
@RequiredArgsConstructor
public class FestivoRestController {

    private final FestivoHandler festivoHandler;

    @GetMapping("/")
    public ResponseEntity<List<FestivoResponse>> listarTodos() {
        return ResponseEntity.ok(festivoHandler.obtenerTodosResponse());
    }
}
