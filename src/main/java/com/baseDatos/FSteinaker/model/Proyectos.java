package com.baseDatos.FSteinaker.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    private Long id;
    private String proyectos;
    private String detalle;
    private String imagen;

    public void setProyectos(String proyectos, String detalle, String imagen) {
        this.proyectos = proyectos;
        this.detalle = detalle;
        this.imagen = imagen;
    }
    
}