package com.gsl.servicosaocliente.controller;

import com.gsl.servicosaocliente.model.FluxoEntrega;
import com.gsl.servicosaocliente.model.dto.EmAndamentoDTO;
import com.gsl.servicosaocliente.model.dto.NovaEntregaDTO;
import com.gsl.servicosaocliente.model.dto.SeguirEtapaDTO;
import com.gsl.servicosaocliente.service.FluxoEntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fluxoentrega")
public class FluxoEntregaController {

    private final FluxoEntregaService fluxoEntregaService;

    public FluxoEntregaController(FluxoEntregaService fluxoEntregaService) {
        this.fluxoEntregaService = fluxoEntregaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<FluxoEntrega> obterFluxoPorId(@PathVariable("id") int id) throws Exception {
        return ResponseEntity.ok(fluxoEntregaService.obterFluxoEntrega(id));
    }

    @GetMapping
    public ResponseEntity<List<FluxoEntrega>> obterEntregas() throws Exception {
        return ResponseEntity.ok(fluxoEntregaService.obterEntregasMensal());
    }

    @PostMapping
    public ResponseEntity<FluxoEntrega> novaEntrega(@RequestBody NovaEntregaDTO nova){
        return ResponseEntity.ok(fluxoEntregaService.criarNovaEntrega(nova));
    }

    @PutMapping("/seguir")
    public ResponseEntity<FluxoEntrega> seguirEtapa(@RequestBody SeguirEtapaDTO seguirEtapaDTO){
        return ResponseEntity.ok(fluxoEntregaService.seguirEtapa(seguirEtapaDTO));
    }

    @PutMapping("/andamento")
    public ResponseEntity<FluxoEntrega> colocarEmAndamento(@RequestBody EmAndamentoDTO andamentoDTO){
        return ResponseEntity.ok(fluxoEntregaService.colocarEmAndamento(andamentoDTO));
    }
}
