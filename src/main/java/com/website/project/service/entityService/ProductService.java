package com.website.project.service.entityService;

import com.website.project.model.Entities.Producto;
import com.website.project.persistence.EntityRepositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void add(Producto nuevoProducto){
        productRepository.save(nuevoProducto);
    }

    public void delete(Integer deleteProduct){
        productRepository.deleteById(deleteProduct);
    }
}
