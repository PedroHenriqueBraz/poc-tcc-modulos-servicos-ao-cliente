package com.gsl.servicosaocliente.controller;

import com.gsl.servicosaocliente.model.dto.FluxoEntregaDTO;
import com.gsl.servicosaocliente.service.FluxoEntregaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fluxoentrega")
public class FluxoEntregaController {

    private final FluxoEntregaService fluxoEntregaService;

    public FluxoEntregaController(FluxoEntregaService fluxoEntregaService) {
        this.fluxoEntregaService = fluxoEntregaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<FluxoEntregaDTO> obterFluxoPorId(@PathVariable("id") int id) throws Exception {
        return ResponseEntity.ok(fluxoEntregaService.obterFluxoEntrega(id));
    }
}
