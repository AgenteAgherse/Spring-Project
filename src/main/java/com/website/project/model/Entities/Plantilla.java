package com.website.project.model.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "plantilla")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Plantilla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String nombre;

    public Plantilla(Integer id){
        this.id = id;
    }
}
