package com.ap.PorfolioApiV8.models;

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
    private Long id_email;
    private String password; 
    private Long id_persona;
    private Long id_rol;
    private String foto_perfil;    
    private String foto_portada;    

    public Usuario() {
    }

    public Usuario(Long id_usuario, Long id_email, String password, Long id_persona, Long id_rol, String foto_perfil, String foto_portada) {
        this.id_usuario = id_usuario;
        this.id_email = id_email;
        this.password = password;
        this.id_persona = id_persona;
        this.id_rol = id_rol;
        this.foto_perfil = foto_perfil;
        this.foto_portada = foto_portada;
    }
    
}
