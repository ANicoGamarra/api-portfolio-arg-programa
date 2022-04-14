package com.ap.PorfolioApiV8.Services.Persona;

import java.util.List;
import java.util.Optional;

import com.ap.PorfolioApiV8.models.Persona;
import com.ap.PorfolioApiV8.repository.IPersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public IPersonaRepository persoRepo;

    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);        
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);        
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public ResponseEntity<Persona> buscarPersonaId(Long id) {
        Optional<Persona> per = persoRepo.findById(id);
        
        if(per.isPresent()){
            return ResponseEntity.ok().body(per.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public void editarPersona(Persona per) {
        persoRepo.save(per);
        
    }
    
}
