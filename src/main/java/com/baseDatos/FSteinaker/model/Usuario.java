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
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String email;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String password;

    public void setUsuario(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
