package org.example.CustomAgency.model;


import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;


@MappedSuperclass
@Getter
@Setter
public class EntidadAuditable {

    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;

    @Enumerated(EnumType.STRING)  //  Esto hace que solo acepte valores válidos muchachos
    @Required
    private EstadoRegistro estado = EstadoRegistro.ACTIVO;

    @PrePersist
    protected void onCreate() {
        this.fechaCreacion = LocalDateTime.now();
        this.fechaActualizacion = this.fechaCreacion;
    }

    @PreUpdate
    protected void onUpdate() {
        this.fechaActualizacion = LocalDateTime.now();
    }



}
