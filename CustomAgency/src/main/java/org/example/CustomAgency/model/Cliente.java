package org.example.CustomAgency.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.ReadOnly;
import org.openxava.annotations.Required;
import org.openxava.annotations.View;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@View(members =
    "direccion;" +
    "email;" +
    "nombre_cliente ;" +
    "ruc;" +
    "telefono;" +
    "estado;"

)
public class Cliente extends BaseEntity{

    @Required
    private String nombre_cliente;

    @Required
    private String ruc;

    @Required
    private String email;

    @Required
    private String telefono;

    @Required
    private String direccion;

    @Required
    @Enumerated(EnumType.STRING)
    private Estado estado;

}
