package com.gsl.servicosaocliente.repository;

import com.gsl.servicosaocliente.model.FluxoEntrega;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FluxoEntregaRepository extends JpaRepository<FluxoEntrega, Integer> {
    Optional<List<FluxoEntrega>> getFluxoEntregaByClienteId(int id);
}
