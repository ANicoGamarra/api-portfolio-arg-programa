package com.ap.PorfolioApiV8.Services.Proyecto;

import java.util.List;
import java.util.Optional;

import com.ap.PorfolioApiV8.models.Proyecto;
import com.ap.PorfolioApiV8.repository.IProyectoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
 
    @Autowired
    public IProyectoRepository proyecRepo;

    @Override
    public List<Proyecto> verProyectos() {
        return proyecRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proyec) {
        proyecRepo.save(proyec);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyecRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proyecRepo.findById(id).orElse(null);
    }

    @Override
    public ResponseEntity<Proyecto> buscarProyectoId(Long id) {
        Optional<Proyecto> proyec = proyecRepo.findById(id);
        
        if(proyec.isPresent()){
            return ResponseEntity.ok().body(proyec.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public void editarProyecto(Proyecto proyec) {
        proyecRepo.save(proyec);
    }
    
}
