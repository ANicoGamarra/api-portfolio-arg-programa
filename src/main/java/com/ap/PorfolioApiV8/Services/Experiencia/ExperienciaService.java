package com.ap.PorfolioApiV8.Services.Experiencia;

import java.util.List;
import java.util.Optional;

import com.ap.PorfolioApiV8.models.Experiencia;
import com.ap.PorfolioApiV8.repository.IExperienciaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    public IExperienciaRepository expRepo;


    @Override
    public List<Experiencia> verExperiencias() {
        
        return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        expRepo.save(exp);
        
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        
        return expRepo.findById(id).orElse(null);
    }

    @Override
    public ResponseEntity<Experiencia> buscarExperienciaId(Long id) {
        Optional<Experiencia> exp = expRepo.findById(id);
        
        if(exp.isPresent()){
            return ResponseEntity.ok().body(exp.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public void editarExperiencia(Experiencia exp) {
        expRepo.save(exp);
        
    }
    
}
