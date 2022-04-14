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
@Table(name = "email")
public class Email {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)       
    private Long id_email;
    private String email;    
    private Long id_persona;


    public Email() {
    }

    public Email(Long id_email, String email, Long id_persona) {
        this.id_email = id_email;
        this.email = email;
        this.id_persona = id_persona;
    }
}
