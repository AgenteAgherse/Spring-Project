package com.website.project.model.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "producto")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "plantilla_id", nullable = false)
    private Integer idPlantilla;

    @Column(name = "tipo", nullable = false, length = 50)
    private String tipoProducto;

    public Producto(Integer id){
        this.id = id;
    }

}
