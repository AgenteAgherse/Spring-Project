package com.website.project.service.entityService;

import com.website.project.model.Entities.Usuario;
import com.website.project.persistence.EntityRepositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Usuario> filtroNombre(String nombre){
        List<Usuario> usuarios = userRepository.listAll(nombre);
        return (usuarios.size() == 0)? null: usuarios;
    }


    public void add(Usuario newUser){
        userRepository.save(newUser);
    }

    public void delete(Integer deleteUser){
        userRepository.deleteById(deleteUser);
    }

    public List<Usuario> listAll(){
        List<Usuario> usuarios = userRepository.findAll();
        return usuarios;
    }

}
