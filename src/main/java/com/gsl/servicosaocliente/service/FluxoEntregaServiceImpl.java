package com.gsl.servicosaocliente.service;

import com.gsl.servicosaocliente.model.Etapa;
import com.gsl.servicosaocliente.model.FluxoEntrega;
import com.gsl.servicosaocliente.model.dto.EmAndamentoDTO;
import com.gsl.servicosaocliente.model.dto.NovaEntregaDTO;
import com.gsl.servicosaocliente.model.dto.SeguirEtapaDTO;
import com.gsl.servicosaocliente.repository.FluxoEntregaRepository;
import com.gsl.servicosaocliente.repository.StatusEtapaRepository;
import com.gsl.servicosaocliente.repository.TipoEtapaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

@Service
public class FluxoEntregaServiceImpl implements FluxoEntregaService{
    private final FluxoEntregaRepository fluxoEntregaRepository;
    private final TipoEtapaRepository tipoEtapaRepository;
    private final StatusEtapaRepository statusEtapaRepository;

    public FluxoEntregaServiceImpl(FluxoEntregaRepository fluxoEntregaRepository, TipoEtapaRepository tipoEtapaRepository, StatusEtapaRepository statusEtapaRepository) {
        this.fluxoEntregaRepository = fluxoEntregaRepository;
        this.tipoEtapaRepository = tipoEtapaRepository;
        this.statusEtapaRepository = statusEtapaRepository;
    }

    @Override
    public FluxoEntrega obterFluxoEntrega(int id) {
     return fluxoEntregaRepository.findById(id).get();
    }

    @Override
    public List<FluxoEntrega> obterFluxoEntregaPorCliente(int id) {
        return fluxoEntregaRepository.getFluxoEntregaByClienteId(id).get();
    }

    @Override
    public FluxoEntrega criarNovaEntrega(NovaEntregaDTO novaEntregaDTO) {
        var fluxo = new FluxoEntrega();
        fluxo.setClienteId(novaEntregaDTO.getClienteId());
        fluxo.setMercadoriaId(novaEntregaDTO.getMercadoriaId());
        fluxo.setValorFrete(novaEntregaDTO.getValorFrete());
        var etapa = new Etapa();
        etapa.setIniciadaEm(LocalDateTime.now());
        etapa.setTipoEtapa(tipoEtapaRepository.findById(novaEntregaDTO.getTipoEtapaId()).get());
        etapa.setStatusEtapa(statusEtapaRepository.findById(novaEntregaDTO.getStatusId()).get());

        fluxo.addEtapa(etapa);
       return fluxoEntregaRepository.saveAndFlush(fluxo);
    }

    @Override
    public FluxoEntrega seguirEtapa(SeguirEtapaDTO seguirEtapa) {
        var fluxo = fluxoEntregaRepository.findById(seguirEtapa.getIdFluxo()).get();
        var etapas = fluxo.getEtapas();

        var etapaAtual =  obterEtapaAtual(etapas);

        etapaAtual.setFinalizadaEm(LocalDateTime.now());
        etapaAtual.setStatusEtapa(statusEtapaRepository.findById(3).get());
        if (!seguirEtapa.getSucesso()){
            etapaAtual.setStatusEtapa(statusEtapaRepository.findById(4).get());
            return  fluxoEntregaRepository.saveAndFlush(fluxo);
        }
        fluxo.addEtapa(definirProximaEtapa(etapaAtual));
        return  fluxoEntregaRepository.saveAndFlush(fluxo);
    }

    @Override
    public FluxoEntrega colocarEmAndamento(EmAndamentoDTO emAndamentoDTO) {
        var fluxo = fluxoEntregaRepository.findById(emAndamentoDTO.getIdFluxo()).get();
        var etapas = fluxo.getEtapas();
        var etapaAtual = obterEtapaAtual(etapas);

        etapaAtual.setStatusEtapa(statusEtapaRepository.findById(2).get());
        return fluxoEntregaRepository.saveAndFlush(fluxo);
    }

    @Override
    public List<FluxoEntrega> obterEntregasMensal() {
        return fluxoEntregaRepository.findAll();
    }

    private Etapa definirProximaEtapa(Etapa atual){
        var etapa = new Etapa();
        etapa.setIniciadaEm(LocalDateTime.now());

        if (atual.getId() != 4) {
            etapa.setTipoEtapa(tipoEtapaRepository.findById(atual.getId() +1).get());
            etapa.setStatusEtapa(statusEtapaRepository.findById(1).get());
        }

        return etapa;
    }

    private Etapa obterEtapaAtual(List<Etapa> etapaList){
        var lastPosition = etapaList.size() -1;

       return etapaList.stream().sorted(Comparator.comparing(Etapa::getId)).toList().get(lastPosition);
    }
}
