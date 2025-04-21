package com.mariano.lucymar_app.backendgastos.controller;

import com.mariano.lucymar_app.backendgastos.dto.GastosDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GastoController {

    @PostMapping("/gastos")
    public ResponseEntity<String> grabarGasto(@Valid @RequestBody GastosDTO gasto) {
            // Acá podés hacer el guardado real o simularlo
        return ResponseEntity.ok("Gasto grabado exitosamente");
    }
}
