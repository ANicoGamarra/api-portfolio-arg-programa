package com.ap.PorfolioApiV8.repository;

import com.ap.PorfolioApiV8.models.Proyecto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto, Long> {

}
    

