package com.website.project.persistence.EntityRepositories;

import com.website.project.model.Entities.Historial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<Historial, Integer> {

}
