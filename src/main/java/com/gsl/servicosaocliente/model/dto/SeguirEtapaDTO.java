package com.gsl.servicosaocliente.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeguirEtapaDTO {
    private int idFluxo;
    private Boolean sucesso;
}
