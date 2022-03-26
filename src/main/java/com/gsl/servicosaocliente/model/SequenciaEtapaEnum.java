package com.gsl.servicosaocliente.model;

public enum SequenciaEtapaEnum {
    EM_SEPARACAO(1, 2),
    EMISSAO_CRT(2,3),
    EM_TRANSPORTE(3, 4),
    ENTREGUE(4, 0);

    private final int id;
    private int idProximo;

    SequenciaEtapaEnum(int id, int idProximo){
        this.idProximo = idProximo;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getIdProximo() {
        return idProximo;
    }
}
