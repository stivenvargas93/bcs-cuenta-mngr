package com.bcscuentamngr.service;

import com.bcscuentamngr.entity.Cuenta;

import java.util.List;

public interface ICuentaService {

    List<Cuenta> findByUsuarioId(Long usuarioId);
}
