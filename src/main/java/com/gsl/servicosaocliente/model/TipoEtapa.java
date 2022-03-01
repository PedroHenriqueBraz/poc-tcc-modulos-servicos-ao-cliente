package com.gsl.servicosaocliente.model;

import javax.persistence.*;

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
}
