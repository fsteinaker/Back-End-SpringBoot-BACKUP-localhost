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

public class Habilidad implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    private Long id;
    private String tipo;
    private String nivel;
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
