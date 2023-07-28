package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Articulo {

    private String descripcion;
    private int cantidad;
    private double precioUnitario;
}
