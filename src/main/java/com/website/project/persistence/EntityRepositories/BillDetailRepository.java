package com.website.project.persistence.EntityRepositories;

import com.website.project.model.Entities.DetalleFactura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillDetailRepository extends JpaRepository<DetalleFactura, Integer> {

}
