package org.example.CustomAgency.model;


import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DescriptionsList;
import org.openxava.annotations.ReadOnly;
import org.openxava.annotations.Required;

import javax.persistence.*;

@Entity
@Table(name = "Usuarios")
@Getter
@Setter

public class Usuario extends EntidadAuditable {

    @SequenceGenerator(name = "usuarioseq"
            , sequenceName = "usuarioseq"
            ,   allocationSize = 1
            , initialValue = 1)

    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "usuarioseq")

    @Id
    @Column(name = "id")
    @ReadOnly
    private int id;

    @Required
    private String username;

    @Required
    private String nombre;
    private String email;

    private boolean activo = true;

    @ManyToOne(fetch = FetchType.LAZY)
    @DescriptionsList
    private Sucursal sucursal;





}
