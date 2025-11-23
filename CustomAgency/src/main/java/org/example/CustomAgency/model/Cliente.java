package org.example.CustomAgency.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.ReadOnly;
import org.openxava.annotations.Required;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
@Getter
@Setter
public class Cliente extends BaseEntity{
    @Column(name = "id")
    @ReadOnly
    private Integer id;

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

}
