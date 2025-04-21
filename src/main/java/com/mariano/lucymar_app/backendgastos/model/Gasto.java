package com.mariano.lucymar_app.backendgastos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name = "LM_GASTOS")  // Asegurate que este sea el nombre correcto en tu BD
public class Gasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Long cod_gasto;

    @NotNull
    private long cod_titular;

    @NotNull
    @DecimalMin("0.01")
    private Double monto;

    @NotNull
    private LocalDate fecha;

    @NotBlank
    private String codigo_moneda;

    @NotNull
    private Float tipo_cambio;

    @NotNull
    private LocalDate fecha_creacion;


    // Getters y Setters
}