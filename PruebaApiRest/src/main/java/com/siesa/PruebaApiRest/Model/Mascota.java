package com.siesa.PruebaApiRest.Model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "mascota")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmascota")
    private Integer idMascota;
    private String nombre;
    @OneToOne
    @JoinColumn(name = "id_tipo_mascota", referencedColumnName = "idtipo_mascota")
    private TipoMascota tipoMascota;
    @OneToOne
    @JoinColumn(name = "id_propietario", referencedColumnName = "idpropietario")
    private Propietario propietario;
}
