package com.ap.PorfolioApiV8.Services.Experiencia;

import java.util.List;

import com.ap.PorfolioApiV8.models.Experiencia;

import org.springframework.http.ResponseEntity;

public interface IExperienciaService {
    
    public List<Experiencia> verExperiencias();
    
    public void crearExperiencia (Experiencia exp);
    
    public void borrarExperiencia (Long id);
    
    public Experiencia buscarExperiencia (Long id);   
    
    public ResponseEntity<Experiencia> buscarExperienciaId (Long id);
    
    public void editarExperiencia (Experiencia exp);

}
