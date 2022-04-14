package com.ap.PorfolioApiV8.Services.Educacion;

import java.util.List;

import com.ap.PorfolioApiV8.models.Educacion;

import org.springframework.http.ResponseEntity;

public interface IEducacionService {
    
    public List<Educacion> verEducaciones();
    
    public void crearEducacion (Educacion edu);
    
    public void borrarEducacion (Long id);
    
    public Educacion buscarEducacion (Long id);   
    
    public ResponseEntity<Educacion> buscarEducacionId (Long id);
    
    public void editarEducacion (Educacion edu);

}
