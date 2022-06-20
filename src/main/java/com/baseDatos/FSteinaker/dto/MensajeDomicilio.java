package com.baseDatos.FSteinaker.dto;

public class MensajeDomicilio {
       private String mensajeDomicilio;
    
    public MensajeDomicilio(String mensajeDomicilio){
        this.mensajeDomicilio = mensajeDomicilio;
    }
    public String getMensajePersona(){
        return mensajeDomicilio;
    }
    public void setMensajePersona(String mensajeDomicilio){
        this.mensajeDomicilio = mensajeDomicilio;

    }
    
}
