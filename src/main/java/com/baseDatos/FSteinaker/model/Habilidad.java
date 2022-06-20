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

public class Habilidad implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String tipo;
    
    @NotNull
    @Size(min = 1, max = 3, message = "no cumple con la longitud")
    private String nivel;
    
    @NotNull
    @Size(min = 1, max = 127, message = "no cumple con la longitud")
    private String detalle;
    
    private String imagen;
    
    public void setHabilidad(long id, String tipo, String nivel, String detalle, String imagen) {
        this.id = id;
        this.tipo = tipo;
        this.nivel = nivel;
        this.detalle = detalle;
        this.imagen = imagen;
    }    
}
