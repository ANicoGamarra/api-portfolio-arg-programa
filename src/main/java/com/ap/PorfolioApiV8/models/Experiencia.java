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
@Table(name = "experiencia")
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_experiencia;
    private String empresa;
    private String puesto;
    private Date fecha_ingreso;
    private Date fecha_egreso;
    private String descripcion;
    private String logo_empresa;
    private String enlace_empresa;  
    private Long id_persona;

    public Experiencia() {
    }

    public Experiencia(Long id_experiencia, String empresa, String puesto, Date fecha_ingreso, Date fecha_egreso, String descripcion, String logo_empresa, String enlace_empresa, Long id_persona) {
        this.id_experiencia = id_experiencia;
        this.empresa = empresa;
        this.puesto = puesto;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_egreso = fecha_egreso;
        this.descripcion = descripcion;
        this.logo_empresa = logo_empresa;
        this.enlace_empresa = enlace_empresa;
        this.id_persona = id_persona;
    }

    
}
