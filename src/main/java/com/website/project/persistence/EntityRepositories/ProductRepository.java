package com.website.project.persistence.EntityRepositories;

import com.website.project.model.Entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Producto, Integer> {

    //Para obtener todos los ID sin que se repitan.
    @Query("SELECT DISTINCT(p.id) FROM Producto p")
    public List<Integer> ListaProductos();
}
