package com.ap.PorfolioApiV8.Services.ImagenesProyecto;

import java.util.List;

import com.ap.PorfolioApiV8.models.ImagenesProyecto;

import org.springframework.http.ResponseEntity;

public interface IImagenesProyectoService {

    public List<ImagenesProyecto> verImagenesProyecto();
    
    public void crearImagenProyecto (ImagenesProyecto imgProyec);
    
    public void borrarImagenProyecto (Long id);
    
    public ImagenesProyecto buscarImagenProyecto (Long id);   
    
    public ResponseEntity<ImagenesProyecto> buscarImagenProyectoId (Long id);
    
    public void editarImagenProyecto (ImagenesProyecto imgProyec);
    
}
