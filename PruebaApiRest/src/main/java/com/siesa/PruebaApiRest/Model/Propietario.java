package com.siesa.PruebaApiRest.Model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "propietario")
public class Propietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpropietario")
    private Integer idPropietario;
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private String comentarios;

}
