package com.website.project.model.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "historial")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Historial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "producto_id", nullable = false)
    private Integer idProducto;

    @Column(name = "detalle_factura_id", nullable = false)
    private Integer idDetalleFactura;

    @Column(name = "Usuario_id", nullable = false)
    private Integer idUsuario;


    private Historial(Integer id){
        this.id = id;
    }


}
