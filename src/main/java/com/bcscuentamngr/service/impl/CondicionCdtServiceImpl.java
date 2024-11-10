package com.bcscuentamngr.service.impl;

import com.bcscuentamngr.entity.CondicionCdt;
import com.bcscuentamngr.repository.CondicionCdtRepository;
import com.bcscuentamngr.service.ICondicionCdtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CondicionCdtServiceImpl implements ICondicionCdtService {

    @Autowired
    private CondicionCdtRepository condicionCdtRepository;

    @Override
    public List<CondicionCdt> findAll() {
        return condicionCdtRepository.findAll();
    }
}
