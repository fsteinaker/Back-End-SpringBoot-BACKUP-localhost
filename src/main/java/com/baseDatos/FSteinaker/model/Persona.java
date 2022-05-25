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
public class Persona implements Serializable {
 
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    private Long id;
    private String apellido;
    private String nombre;
    private int edad;
    private String profesion;
    private String perfil;
    private String fecha_nacimiento;
    private String telefono;
    private String correo;
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