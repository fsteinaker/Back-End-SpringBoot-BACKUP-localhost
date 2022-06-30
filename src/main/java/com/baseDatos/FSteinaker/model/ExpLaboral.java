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

public class ExpLaboral implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String empresa;
    
    @NotNull
    @Size(min = 1, max = 20, message = "no cumple con la longitud")
    private String fecha_inicio;
    
    @NotNull
    @Size(min = 1, max = 20, message = "no cumple con la longitud")
    private String fecha_final;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String empleo_cargo;    
    
    @NotNull
    @Size(min = 1, max = 512, message = "no cumple con la longitud")
    private String detalle;    
    
    private String imagen;
    
    public void setExpLaboral(long id, String empresa,  String fecha_inicio, String fecha_final, String empleo_cargo, String detalle, String imagen) {
        this.id = id;
        this.empresa = empresa;        
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.empleo_cargo = empleo_cargo;
        this.detalle = detalle;       
        this.imagen = imagen;
    }    
}
