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
@Table(name = "proyecto")
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id_proyecto;    
    private String nombre;    
    private Date fecha;    
    private String descripcion;
    private String enlace;
    private String proyecto_portada;


    public Proyecto() {
    }

    public Proyecto(Long id_proyecto, String nombre, Date fecha, String descripcion, String enlace, String proyecto_portada) {
        this.id_proyecto = id_proyecto;
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.enlace = enlace;
        this.proyecto_portada = proyecto_portada;
    }
    
}
