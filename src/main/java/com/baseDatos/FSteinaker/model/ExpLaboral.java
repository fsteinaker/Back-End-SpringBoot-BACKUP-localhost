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
    private String empleo_cargo;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String empresa;
    
    @NotNull
    @Size(min = 1, max = 512, message = "no cumple con la longitud")
    private String detalle;
    
    @NotNull
    @Size(min = 1, max = 20, message = "no cumple con la longitud")
    private String fecha_inicio;
    
    @NotNull
    @Size(min = 1, max = 20, message = "no cumple con la longitud")
    private String fecha_final;
    
    private String imagen;
    
    public void setExpLaboral(long id, String empleo_cargo, String empresa, String detalle, String fecha_inicio, String fecha_final, String titulo, String imagen) {
        this.id = id;
        this.empleo_cargo = empleo_cargo;
        this.empresa = empresa;
        this.detalle = detalle;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.imagen = imagen;
    }    
}
