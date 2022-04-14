package com.ap.PorfolioApiV8.Services.Proyecto;

import java.util.List;

import com.ap.PorfolioApiV8.models.Proyecto;

import org.springframework.http.ResponseEntity;

public interface IProyectoService {
    
    public List<Proyecto> verProyectos();
    
    public void crearProyecto (Proyecto proyec);
    
    public void borrarProyecto (Long id);
    
    public Proyecto buscarProyecto (Long id);   
    
    public ResponseEntity<Proyecto> buscarProyectoId (Long id);
    
    public void editarProyecto (Proyecto proyec);

}
