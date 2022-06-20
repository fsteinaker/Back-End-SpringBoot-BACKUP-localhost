package com.baseDatos.FSteinaker.dto;

public class MensajeLocalidad {
     private String mensajeLocalidad;
    
    public MensajeLocalidad(String mensajeLocalidad){
        this.mensajeLocalidad = mensajeLocalidad;
    }
    public String getMensajeExperiencia(){
        return mensajeLocalidad;
    }
    public void setMensajeExperiencia(String mensajeLocalidad){
        this.mensajeLocalidad = mensajeLocalidad;

    }
}
