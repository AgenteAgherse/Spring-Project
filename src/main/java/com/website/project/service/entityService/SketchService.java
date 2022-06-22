package com.website.project.service.entityService;

import com.website.project.model.Entities.Plantilla;
import com.website.project.persistence.EntityRepositories.SketchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SketchService {

    @Autowired
    private SketchRepository sketchRepository;


    //Puede ser usado también para actualizar un nuevo recurso. Solo hay que actualizar los datos de por sí.
    public void add(Plantilla nuevaPlantilla){
        sketchRepository.save(nuevaPlantilla);
    }

    public void delete(Integer deleteSketch){
        sketchRepository.deleteById(deleteSketch);
    }
}
