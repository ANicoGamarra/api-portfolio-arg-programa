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
@Table(name = "educacion")
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id_educacion;
    private String titulo;
    private String institucion;
    private Date fecha_egresado;
    private String certificado;
    private String logo_educacion;   
    private Long id_persona;
    private Long id_nivel_educacion;

    public Educacion() {
    }

    public Educacion(Long id_educacion, String titulo, String institucion, Date fecha_egresado, String certificado, String logo_educacion, Long id_persona, Long id_nivel_educacion) {
        this.id_educacion = id_educacion;
        this.titulo = titulo;
        this.institucion = institucion;
        this.fecha_egresado = fecha_egresado;
        this.certificado = certificado;
        this.logo_educacion = logo_educacion;
        this.id_persona = id_persona;
        this.id_nivel_educacion = id_nivel_educacion;
    }

}
