package com.gsl.servicosaocliente.service;

import com.gsl.servicosaocliente.model.FluxoEntrega;
import com.gsl.servicosaocliente.model.dto.EmAndamentoDTO;
import com.gsl.servicosaocliente.model.dto.FluxoEntregaDTO;
import com.gsl.servicosaocliente.model.dto.NovaEntregaDTO;
import com.gsl.servicosaocliente.model.dto.SeguirEtapaDTO;

import java.util.List;

public interface FluxoEntregaService {
    FluxoEntrega obterFluxoEntrega(int id);
    List<FluxoEntrega> obterFluxoEntregaPorCliente(int id);
    FluxoEntrega criarNovaEntrega(NovaEntregaDTO novaEntregaDTO);
    FluxoEntrega seguirEtapa(SeguirEtapaDTO seguirEtapa);
    FluxoEntrega colocarEmAndamento(EmAndamentoDTO emAndamentoDTO);
    List<FluxoEntrega> obterEntregasMensal();
}
