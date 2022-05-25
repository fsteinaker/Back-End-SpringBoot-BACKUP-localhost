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

public class ExpLaboral implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    private Long id;
    private String empleo_cargo;
    private String empresa;
    private String detalle;
    private String fecha_inicio;
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
