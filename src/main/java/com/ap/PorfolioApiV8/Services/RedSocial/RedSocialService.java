package com.ap.PorfolioApiV8.Services.RedSocial;

import java.util.List;
import java.util.Optional;

import com.ap.PorfolioApiV8.models.RedSocial;
import com.ap.PorfolioApiV8.repository.IRedSocialRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RedSocialService implements IRedSocialService {

    @Autowired
    public IRedSocialRepository redSocialRepo;   
   
    @Override
    public List<RedSocial> verRedSociales() {
        
        return redSocialRepo.findAll();
    }

    @Override
    public void crearRedSocial(RedSocial redSoc) {
        redSocialRepo.save(redSoc);
        
    }

    @Override
    public void borrarRedSocial(Long id) {
        redSocialRepo.deleteById(id);
        
    }

    @Override
    public RedSocial buscarRedSocial(Long id) {
        
        return redSocialRepo.findById(id).orElse(null);
    }

    @Override
    public ResponseEntity<RedSocial> buscarRedSocialId(Long id) {
        Optional<RedSocial> redSoc = redSocialRepo.findById(id);
        
        if(redSoc.isPresent()){
            return ResponseEntity.ok().body(redSoc.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public void editarRedSocial(RedSocial redSoc) {
        redSocialRepo.save(redSoc);
        
        
    }
    
}
