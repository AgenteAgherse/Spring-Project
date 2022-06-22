package com.website.project.model.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "detalle_factura")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DetalleFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "factura_id", nullable = false)
    private Integer idFactura;

    @Column(name = "descripcion", nullable = false)
    private Integer descripcion;

    @Column(name = "metodo_depago", nullable = false, length = 50)
    private Integer formaPago;

    @Column(name = "coste_total", nullable = false)
    private Double total;
}
