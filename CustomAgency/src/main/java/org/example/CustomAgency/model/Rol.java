package org.example.CustomAgency.model;


import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;

import javax.persistence.*;

@Entity
@Table(name = "Roles")
@Getter
@Setter
public class Rol extends BaseEntity{


    @Required
    private String nombre;






}
