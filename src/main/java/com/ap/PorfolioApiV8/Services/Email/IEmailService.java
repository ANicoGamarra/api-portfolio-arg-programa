package com.ap.PorfolioApiV8.Services.Email;

import java.util.List;

import com.ap.PorfolioApiV8.models.Email;

import org.springframework.http.ResponseEntity;

public interface IEmailService {
    
    public List<Email> verEmails();
    
    public void crearEmail (Email email);
    
    public void borrarEmail (Long id);
    
    public Email buscarEmail (Long id);   
    
    public ResponseEntity<Email> buscarEmailId (Long id);
    
    public void editarEmail (Email email);

}
