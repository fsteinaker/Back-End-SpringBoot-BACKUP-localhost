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
public class Localidad implements Serializable {
 
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String ciudad;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String provincia;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String pais;
    
    @NotNull
    @Size(min = 1, max = 10, message = "no cumple con la longitud")
    private String codigo_postal;
    
    public void setLocalidad (long id, String ciudad, String provincia, String pais, String codigo_postal) {
        this.id = id;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
        this.codigo_postal = codigo_postal;
    }   
    
}