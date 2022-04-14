package com.ap.PorfolioApiV8.Services.Email;

import java.util.List;
import java.util.Optional;

import com.ap.PorfolioApiV8.models.Email;
import com.ap.PorfolioApiV8.repository.IEmailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements IEmailService {

    @Autowired
    public IEmailRepository emailRepo;
    
    @Override
    public List<Email> verEmails() {
        return emailRepo.findAll();
    }

    @Override
    public void crearEmail(Email email) {
        emailRepo.save(email);
    }

    @Override
    public void borrarEmail(Long id) {
        emailRepo.deleteById(id);
    }

    @Override
    public Email buscarEmail(Long id) {
        return emailRepo.findById(id).orElse(null);
    }

    @Override
    public ResponseEntity<Email> buscarEmailId(Long id) {
        Optional<Email> email = emailRepo.findById(id);
        
        if(email.isPresent()){
            return ResponseEntity.ok().body(email.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public void editarEmail(Email email) {
        emailRepo.save(email);
    }
    
}
