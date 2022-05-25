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
public class Localidad implements Serializable {
 
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    private Long id;
    private String ciudad;
    private String provincia;
    private String pais;
    private String codigo_postal;
    
    public void setLocalidad (long id, String ciudad, String provincia, String pais, String codigo_postal) {
        this.id = id;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
        this.codigo_postal = codigo_postal;
    }   
    
}