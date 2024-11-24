package com.ejemplo.crud.services;

import com.ejemplo.crud.domains.Accion;

public interface AccionService {
    Iterable<Accion> findAll();
}
