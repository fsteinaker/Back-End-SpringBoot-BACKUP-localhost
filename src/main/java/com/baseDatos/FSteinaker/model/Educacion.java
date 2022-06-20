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

public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String institucion;
    
    @NotNull
    @Size(min = 1, max = 20, message = "no cumple con la longitud")
    private String fecha_inicio;
    
    @NotNull
    @Size(min = 1, max = 20, message = "no cumple con la longitud")
    private String fecha_final;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String titulo;
    
    @NotNull
    @Size(min = 1, max = 255, message = "no cumple con la longitud")
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