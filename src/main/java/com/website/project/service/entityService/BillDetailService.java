package com.website.project.service.entityService;

import com.website.project.model.Entities.DetalleFactura;
import com.website.project.persistence.EntityRepositories.BillDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillDetailService {

    @Autowired
    private BillDetailRepository billDetailRepository;

    public void addNewDetailToBill(DetalleFactura newDetail){
        billDetailRepository.save(newDetail);
    }

    public void deleteDetailBill(Integer id){
        billDetailRepository.deleteById(id);
    }
}
