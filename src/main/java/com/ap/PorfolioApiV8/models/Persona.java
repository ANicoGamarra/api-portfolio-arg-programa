package com.ap.PorfolioApiV8.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id_persona;    
    private String nombre;    
    private String apellido;    
    
    private Date fecha_nac;    
    private String descripcion;
    private String localidad;

    public Persona() {
    }

    public Persona(Long id_persona, String nombre, String apellido, Date fecha_nac, String descripcion, String localidad) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.descripcion = descripcion;
        this.localidad = localidad;
    }

    
}
