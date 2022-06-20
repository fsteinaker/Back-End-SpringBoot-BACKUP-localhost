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
public class Persona implements Serializable {
 
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)    
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud requerida.")
    private String apellido;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud requerida.")
    private String nombre;
    
    @NotNull
    private int edad;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud requerida.")
    private String profesion;
    
    @NotNull
    @Size(min = 1, max = 512, message = "No cumple con la longitud requerida.")
    private String perfil;
    
    @NotNull
    @Size(min = 1, max = 10, message = "No cumple con la longitud requerida.")
    private String fecha_nacimiento;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud requerida.")
    private String telefono;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud requerida.")
    private String correo;
    
    @NotNull
    @Size(min = 1, max = 100, message = "No cumple con la longitud requerida.")
    private String imagen;
    
   public void setPersona(String apellido, String nombre, int edad, String profesion, String perfil, String fecha_nacimiento, String telefono, String correo, String imagen) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.perfil = perfil;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.imagen = imagen;
    }
    
    
}