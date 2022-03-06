package com.gsl.servicosaocliente.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="tipo_etapa")
public class TipoEtapa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipo_etapa_id", nullable = false)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @OneToOne(mappedBy = "tipoEtapa")
    private Etapa etapa;

    public TipoEtapa() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoEtapa tipoEtapa = (TipoEtapa) o;
        return id.equals(tipoEtapa.id) && nome.equals(tipoEtapa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Etapa getEtapa() {
        return etapa;
    }

    public void setEtapa(Etapa etapa) {
        this.etapa = etapa;
    }
}
