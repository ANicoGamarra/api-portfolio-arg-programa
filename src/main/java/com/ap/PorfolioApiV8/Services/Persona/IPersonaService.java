package com.ap.PorfolioApiV8.Services.Persona;

import java.util.List;

import com.ap.PorfolioApiV8.models.Persona;

import org.springframework.http.ResponseEntity;

public interface IPersonaService {
    
    public List<Persona> verPersonas();
    
    public void crearPersona (Persona per);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona (Long id);   
    
    public ResponseEntity<Persona> buscarPersonaId (Long id);
    
    public void editarPersona (Persona per);

}
