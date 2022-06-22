package com.website.project.persistence.EntityRepositories;


import com.website.project.model.Entities.Plantilla;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SketchRepository extends JpaRepository<Plantilla, Integer> {

}
