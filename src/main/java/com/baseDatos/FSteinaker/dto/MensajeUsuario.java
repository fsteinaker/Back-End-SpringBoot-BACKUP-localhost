package com.baseDatos.FSteinaker.dto;

public class MensajeUsuario {
    private String mensajeUsuario;
    
    public MensajeUsuario(String mensajeUsuario){
        this.mensajeUsuario = mensajeUsuario;
    }
    public String getMensajePersona(){
        return mensajeUsuario;
    }
    public void setMensajePersona(String mensajeUsuario){
        this.mensajeUsuario = mensajeUsuario;

    }
}
