package com.gsl.servicosaocliente.model;

import javax.persistence.*;

@Entity
@Table(name="status_etapa")
public class StatusEtapa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "status_etapa_id", nullable = false)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @OneToOne(mappedBy = "statusEtapa")
    private Etapa etapa;
}
