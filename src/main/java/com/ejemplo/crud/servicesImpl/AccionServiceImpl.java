package com.ejemplo.crud.servicesImpl;

import com.ejemplo.crud.domains.Accion;
import com.ejemplo.crud.repositories.AccionRepository;
import com.ejemplo.crud.services.AccionService;
import org.springframework.stereotype.Service;

@Service
public class AccionServiceImpl implements AccionService {

    private final AccionRepository accionRepository;

    public AccionServiceImpl(AccionRepository accionRepository) {
        this.accionRepository = accionRepository;
    }

    @Override
    public Iterable<Accion> findAll() {
        return accionRepository.findAll();
    }
}
