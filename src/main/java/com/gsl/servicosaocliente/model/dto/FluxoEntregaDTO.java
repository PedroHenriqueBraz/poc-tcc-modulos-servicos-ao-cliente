package com.gsl.servicosaocliente.model.dto;

import com.gsl.servicosaocliente.model.Etapa;

import java.math.BigDecimal;
import java.util.List;

public class FluxoEntregaDTO {

    private Integer id;

    private Integer clienteId;

    private Integer mercadoriaId;

    private BigDecimal valorFrete;

    private List<Etapa> etapas;
}
