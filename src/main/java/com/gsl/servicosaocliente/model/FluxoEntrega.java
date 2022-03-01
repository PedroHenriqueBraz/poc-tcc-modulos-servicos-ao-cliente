package com.gsl.servicosaocliente.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="fluxo_entrega")
public class FluxoEntrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fluxo_id", nullable = false)
    private Integer id;

    @Column(name = "cliente_id")
    private String clienteId;

    @Column(name = "mercadoria_id")
    private String mercadoriaId;

    @Column(name = "valor_frete")
    private String valorFrete;

    @OneToMany(mappedBy = "fluxoEntrega")
    private List<Etapa> etapas;
}
