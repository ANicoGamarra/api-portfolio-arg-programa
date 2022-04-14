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
@Table(name = "skill")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_skill;
    private String habilidad;
    private int porcentaje;
    private int id_tipo_skill;
    private Long id_persona;

    public Skill() {
    }

    public Skill(Long id_skill, String habilidad, int porcentaje, int id_tipo_skill, Long id_persona) {
        this.id_skill = id_skill;
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
        this.id_tipo_skill = id_tipo_skill;
        this.id_persona = id_persona;
    }
    
}
