package org.example.CustomAgency.model;


import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;

import javax.persistence.*;

@Entity
@Table(name = "Sucursal")
@Getter
@Setter
public class Sucursal extends BaseEntity {

    @Required
    private String codigo;
    private String nombre;
    private String direccion;
    private String telefono;

}
