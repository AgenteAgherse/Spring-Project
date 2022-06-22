package com.website.project.service.entityService;

import com.website.project.model.Entities.Factura;
import com.website.project.persistence.EntityRepositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService {

    @Autowired
    private BillRepository billRepository;

    public void add(Factura nuevaFactura){
        billRepository.save(nuevaFactura);
    }

    public void remove(Integer id){
        billRepository.deleteById(id);
    }
}
