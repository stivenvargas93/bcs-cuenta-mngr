package com.bcscuentamngr.controller;

import com.bcscuentamngr.entity.Cuenta;
import com.bcscuentamngr.service.ICuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cuentas")
@CrossOrigin(origins = "*")
public class CuentaController {

    @Autowired
    private ICuentaService cuentaService;

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<Cuenta>> getCuentasByUsuarioId(@PathVariable Long usuarioId) {
        List<Cuenta> cuentas = cuentaService.findByUsuarioId(usuarioId);
        return new ResponseEntity<>(cuentas, HttpStatus.OK);
    }
}
