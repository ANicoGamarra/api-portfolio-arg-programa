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
@Table(name = "red_social")
public class RedSocial {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_red_social;        
    private String nombre; 
    private String usuario;
    private Long id_persona;
    
    public RedSocial() {
    }

    public RedSocial(Long id_red_social, String nombre, String usuario, Long id_persona) {
        this.id_red_social = id_red_social;
        this.nombre = nombre;
        this.usuario = usuario;
        this.id_persona = id_persona;
    }


}
