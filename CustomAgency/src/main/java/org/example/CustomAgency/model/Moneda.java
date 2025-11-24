package org.example.CustomAgency.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.View;

import javax.persistence.*;

@Entity
@Table(name = "moneda")
@Getter
@Setter
@View(members =
    "nombreMoneda;")
//Las relación OneToMany a Expediente ya están declarada
//Está como comentario hasta que esa tablas sean terminada

public class Moneda extends BaseEntity{

    @Column(name = "nombre_moneda", length = 50)
    private String nombreMoneda;



    //@OneToMany(mappedBy = "moneda", cascade = CascadeType.ALL)
    //private List<Expediente> expedientes;
}