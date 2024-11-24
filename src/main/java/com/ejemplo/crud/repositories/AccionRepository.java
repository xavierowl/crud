package com.ejemplo.crud.repositories;

import com.ejemplo.crud.domains.Accion;
import org.springframework.data.repository.CrudRepository;

public interface AccionRepository extends CrudRepository<Accion, Long> {
}
