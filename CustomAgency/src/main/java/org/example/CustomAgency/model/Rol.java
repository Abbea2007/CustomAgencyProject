package org.example.CustomAgency.model;
import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;
import org.openxava.annotations.View;

import javax.persistence.*;

@Entity
@Table(name = "rol")
@Getter
@Setter
@View(members =
     "nombre;")
public class Rol extends BaseEntity{


    @Required
    private String nombre;






}
