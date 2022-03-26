package com.gsl.servicosaocliente.model;

public enum SequenciaStatusEnum {
    PENDENTE(1,2),
    EM_ANDAMENTO(2, 3),
    FINALIZADO(3, 0),
    CANCELADO(4, 0);

    private int id;
    private int idProximo;

    SequenciaStatusEnum(int id, int idProximo){
        this.id = id;
        this.idProximo = idProximo;
    }

    public int getIdProximo() {
        return idProximo;
    }

    public int getId() {
        return id;
    }
}
