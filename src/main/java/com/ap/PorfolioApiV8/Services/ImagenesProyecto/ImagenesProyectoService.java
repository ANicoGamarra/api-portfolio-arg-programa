package com.ap.PorfolioApiV8.Services.ImagenesProyecto;

import java.util.List;
import java.util.Optional;

import com.ap.PorfolioApiV8.models.ImagenesProyecto;
import com.ap.PorfolioApiV8.repository.IImagenesProyectoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class ImagenesProyectoService implements IImagenesProyectoService{

    @Autowired
    public IImagenesProyectoRepository imgProyecRepo;

    @Override
    public List<ImagenesProyecto> verImagenesProyecto() {
        
        return imgProyecRepo.findAll();
    }

    @Override
    public void crearImagenProyecto(ImagenesProyecto imgProyec) {
            
            imgProyecRepo.save(imgProyec);
        
    }

    @Override
    public void borrarImagenProyecto(Long id) {
            
            imgProyecRepo.deleteById(id);
            
        
    }

    @Override
    public ImagenesProyecto buscarImagenProyecto(Long id) {
        
        return imgProyecRepo.findById(id).orElse(null);
    }

    @Override
    public ResponseEntity<ImagenesProyecto> buscarImagenProyectoId(Long id) {
        Optional<ImagenesProyecto> imgProyec = imgProyecRepo.findById(id);
        
        if(imgProyec.isPresent()){
            return ResponseEntity.ok().body(imgProyec.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public void editarImagenProyecto(ImagenesProyecto imgProyec) {
        imgProyecRepo.save(imgProyec);
        
    }
    
}
