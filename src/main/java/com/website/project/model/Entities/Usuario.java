package com.website.project.model.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String apellido1;

    @Column(nullable = false, length = 50)
    private String apellido2;

    @Column(nullable = false, length = 150)
    private String email;

    @Column(nullable = false, length = 10)
    private String celular;

    @Column(nullable = false, length = 1)
    private Character sexo;

    public Usuario(Integer id){
        this.id = id;
    }

}
