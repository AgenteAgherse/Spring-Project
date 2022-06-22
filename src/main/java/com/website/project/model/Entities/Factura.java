package com.website.project.model.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "factura")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = false)
    private Integer id;

    @Column(name = "producto_id", nullable = false)
    private Integer idProducto;

    @Column(name = "Usuario_id", nullable = false)
    private Integer idUsuario;

}
