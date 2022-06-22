package com.website.project.persistence.EntityRepositories;

import com.website.project.model.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<Usuario, Integer> {

    @Query("SELECT u FROM Usuario u WHERE u.nombre LIKE %?1%")
    public List<Usuario> listAll(String nombre);

}
