package com.gsl.servicosaocliente.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="etapa")
public class Etapa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "etapa_id", nullable = false)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "tipo_etapa_id")
    @JsonIgnoreProperties("etapa")
    private TipoEtapa tipoEtapa;

    @OneToOne
    @JoinColumn(name = "status_etapa_id")
    @JsonIgnoreProperties("etapa")

    private StatusEtapa statusEtapa;

    @Column(name = "iniciada_em")
    private LocalDateTime iniciadaEm;

    @Column(name = "finalizada_em")
    private LocalDateTime finalizadaEm;

    @JsonIgnoreProperties("etapas")
    @ManyToOne(fetch = FetchType.EAGER)
    private FluxoEntrega fluxoEntrega;

    public Etapa() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoEtapa getTipoEtapa() {
        return tipoEtapa;
    }

    public void setTipoEtapa(TipoEtapa tipoEtapa) {
        this.tipoEtapa = tipoEtapa;
    }

    public StatusEtapa getStatusEtapa() {
        return statusEtapa;
    }

    public void setStatusEtapa(StatusEtapa statusEtapa) {
        this.statusEtapa = statusEtapa;
    }

    public LocalDateTime getIniciadaEm() {
        return iniciadaEm;
    }

    public void setIniciadaEm(LocalDateTime iniciadaEm) {
        this.iniciadaEm = iniciadaEm;
    }

    public LocalDateTime getFinalizadaEm() {
        return finalizadaEm;
    }

    public void setFinalizadaEm(LocalDateTime finalizadaEm) {
        this.finalizadaEm = finalizadaEm;
    }

    public FluxoEntrega getFluxoEntrega() {
        return fluxoEntrega;
    }

    public void setFluxoEntrega(FluxoEntrega fluxoEntrega) {
        this.fluxoEntrega = fluxoEntrega;
    }
}
