package com.gsl.servicosaocliente.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NovaEntregaDTO {
    private Integer clienteId;
    private Integer mercadoriaId;
    private BigDecimal valorFrete;
    private Integer tipoEtapaId;
    private Integer statusId;
}
