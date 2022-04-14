package com.ap.PorfolioApiV8.repository;

import com.ap.PorfolioApiV8.models.Experiencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia, Long> {

}
    

