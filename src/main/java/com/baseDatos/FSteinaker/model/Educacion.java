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

public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    private Long id;
    private String institucion;
    private String fecha_inicio;
    private String fecha_final;
    private String titulo;
    private String detalle;
    private String imagen;
    
    public void setEducacion(long id, String institucion, String fecha_inicio, String fecha_final, String titulo, String detalle, String imagen) {
        this.id = id;
        this.institucion = institucion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.titulo = titulo;
        this.detalle = detalle;
        this.imagen = imagen;
    }    
}