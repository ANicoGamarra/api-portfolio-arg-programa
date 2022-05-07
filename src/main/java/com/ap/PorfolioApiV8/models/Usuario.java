package com.ap.PorfolioApiV8.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;    
    @Column(name = "usuario") 
    private String nombreUsuario;
    private String email;
    private String password; 
    private Long id_persona;
    
    private String foto_perfil;    
    private String foto_portada;    

    public Usuario() {
    }

    public Usuario( String nombreUsuario, String password, String email,  Long id_persona, String foto_perfil, String foto_portada) {
       
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.email = email;
        this.id_persona = id_persona;
        
        this.foto_perfil = foto_perfil;
        this.foto_portada = foto_portada;
    }

    
    
}
