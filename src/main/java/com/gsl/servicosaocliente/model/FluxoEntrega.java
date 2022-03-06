package com.gsl.servicosaocliente.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="fluxo_entrega")
public class FluxoEntrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fluxo_id", nullable = false)
    private Integer id;

    @Column(name = "cliente_id")
    private Integer clienteId;

    @Column(name = "mercadoria_id")
    private Integer mercadoriaId;

    @Column(name = "valor_frete")
    private BigDecimal valorFrete;

    @OneToMany(mappedBy = "fluxoEntrega", cascade = CascadeType.ALL)
    private List<Etapa> etapas = new ArrayList<>();

    public void addEtapa(Etapa etapa){
        etapas.add(etapa);
        etapa.setFluxoEntrega(this);
    }

    public FluxoEntrega() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getMercadoriaId() {
        return mercadoriaId;
    }

    public void setMercadoriaId(Integer mercadoriaId) {
        this.mercadoriaId = mercadoriaId;
    }

    public BigDecimal getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
    }

    public List<Etapa> getEtapas() {
        return etapas;
    }

    public void setEtapas(List<Etapa> etapas) {
        this.etapas = etapas;
    }
}
