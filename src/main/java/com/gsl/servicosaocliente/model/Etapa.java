package com.gsl.servicosaocliente.model;

import javax.persistence.*;

@Entity
@Table(name="etapa")
public class Etapa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "etapa_id", nullable = false)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "tipo_etapa_id")
    private TipoEtapa tipoEtapa;

    @OneToOne
    @JoinColumn(name = "status_etapa_id")
    private StatusEtapa statusEtapa;

    @Column(name = "iniciada_em")
    private String iniciadaEm;

    @Column(name = "finalizada_em")
    private String finalizadaEm;

    @ManyToOne
    private FluxoEntrega fluxoEntrega;

    public Etapa() {
    }


}
