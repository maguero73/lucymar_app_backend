package com.mariano.lucymar_app.backendgastos.service;


import com.mariano.lucymar_app.backendgastos.model.Gasto;
import com.mariano.lucymar_app.backendgastos.repository.GastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GastoSService {

    @Autowired
    private GastoRepository gastoRepository;

    public Gasto guardarGasto(Gasto gasto) {
        return gastoRepository.save(gasto);
    }
}