package com.website.project.service.entityService;

import com.website.project.model.Entities.Historial;
import com.website.project.persistence.EntityRepositories.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryService {

    @Autowired
    private HistoryRepository historyRepository;

    public void addToHistory(Historial historialNuevo){
        historyRepository.save(historialNuevo);
    }

    public void deleteIntoHistory(Integer id){
        historyRepository.deleteById(id);
    }
}
