package com.website.project.persistence.EntityRepositories;

import com.website.project.model.Entities.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Factura, Integer> {

}
