package org.example.CustomAgency.model;


import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DescriptionsList;
import org.openxava.annotations.ReadOnly;
import org.openxava.annotations.View;

import javax.persistence.*;

@Entity
@Table(name = "usuariorol",
uniqueConstraints = @UniqueConstraint(columnNames = {"id_usuario", "id_rol"}))


@Getter
@Setter
@View(members =
    "usuario;" +
    "rol;")
public class UsuarioRol extends BaseEntity {


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    @DescriptionsList(descriptionProperties="nombre")
    private Usuario usuario;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rol")
    @DescriptionsList(descriptionProperties="nombre")
    private Rol rol;
}
