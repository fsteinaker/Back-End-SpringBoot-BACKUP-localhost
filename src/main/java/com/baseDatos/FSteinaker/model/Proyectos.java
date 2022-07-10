package com.baseDatos.FSteinaker.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String proyectos;
    
    @NotNull
    @Size(min = 1, max = 255, message = "no cumple con la longitud")
    private String detalle;
    
    @NotNull
    @Size(min = 1, max = 100, message = "no cumple con la longitud")
    private String tecnologia;
    
    private String linkProyecto;
    
    private String imagen;

    public void setProyectos(String proyectos, String tecnologia,String detalle, String imagen, String linkProyecto) {
        this.proyectos = proyectos;
        this.detalle = detalle;
        this.tecnologia = tecnologia;
        this.imagen = imagen;
        this.linkProyecto = linkProyecto;
    }
    
}