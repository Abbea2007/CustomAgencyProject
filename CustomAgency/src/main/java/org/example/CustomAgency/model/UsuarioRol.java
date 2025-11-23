package org.example.CustomAgency.model;


import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DescriptionsList;
import org.openxava.annotations.ReadOnly;

import javax.persistence.*;

@Entity
@Table(name = "UsuariosRoles",
uniqueConstraints = @UniqueConstraint(columnNames = {"id_usuario", "id_rol"}))


@Getter
@Setter
public class UsuarioRol extends BaseEntity {


    @ManyToOne(fetch = FetchType.LAZY)
    @DescriptionsList(descriptionProperties="nombre")
    private Usuario usuario;


    @ManyToOne(fetch = FetchType.LAZY)
    @DescriptionsList(descriptionProperties="nombre")
    private Rol rol;
}
