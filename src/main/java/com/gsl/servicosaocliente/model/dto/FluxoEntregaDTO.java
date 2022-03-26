package com.gsl.servicosaocliente.model.dto;

import com.gsl.servicosaocliente.model.Etapa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class FluxoEntregaDTO {

    private Integer id;

    private Integer clienteId;

    private Integer mercadoriaId;

    private BigDecimal valorFrete;

    private LocalDate dataPrevisao;

    private LocalDate dataEntrega;

    private List<Etapa> etapas;
}
