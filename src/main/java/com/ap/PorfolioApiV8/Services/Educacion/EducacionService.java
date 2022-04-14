package com.ap.PorfolioApiV8.Services.Educacion;

import java.util.List;
import java.util.Optional;

import com.ap.PorfolioApiV8.models.Educacion;
import com.ap.PorfolioApiV8.repository.IEducacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class EducacionService implements IEducacionService {

    @Autowired  
    private IEducacionRepository eduRepo;

    @Override
    public List<Educacion> verEducaciones() {       
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public ResponseEntity<Educacion> buscarEducacionId(Long id) {
        Optional<Educacion> edu = eduRepo.findById(id);
        
        if(edu.isPresent()){
            return ResponseEntity.ok().body(edu.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public void editarEducacion(Educacion edu) {
        eduRepo.save(edu);
        
    }
    
}
