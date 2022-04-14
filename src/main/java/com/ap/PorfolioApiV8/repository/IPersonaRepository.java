package com.ap.PorfolioApiV8.repository;

import com.ap.PorfolioApiV8.models.Persona;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {


}
    

