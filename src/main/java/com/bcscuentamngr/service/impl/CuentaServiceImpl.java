package com.bcscuentamngr.service.impl;

import com.bcscuentamngr.entity.Cuenta;
import com.bcscuentamngr.repository.CuentaRepository;
import com.bcscuentamngr.service.ICuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaServiceImpl implements ICuentaService {
    @Autowired
    private CuentaRepository cuentaRepository;

    @Override
    public List<Cuenta> findByUsuarioId(Long usuarioId) {
        return cuentaRepository.findByUsuarioId(usuarioId);
    }
}
