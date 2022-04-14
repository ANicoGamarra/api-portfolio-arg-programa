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
@Table(name = "imagenes_proyecto")
public class ImagenesProyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_imagenes_proyecto;    
    private String enlace_imagenes_proyecto;    
    private Long id_proyecto;     

    public ImagenesProyecto() {
    }

    public ImagenesProyecto(Long id_imagenes_proyecto, String enlace_imagenes_proyecto, Long id_proyecto) {
        this.id_imagenes_proyecto = id_imagenes_proyecto;
        this.enlace_imagenes_proyecto = enlace_imagenes_proyecto;
        this.id_proyecto = id_proyecto;
    }
    
}
