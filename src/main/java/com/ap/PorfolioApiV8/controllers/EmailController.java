package com.ap.PorfolioApiV8.controllers;

import java.util.List;

import com.ap.PorfolioApiV8.Services.Email.IEmailService;
import com.ap.PorfolioApiV8.models.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emails")
public class EmailController {
    
    @Autowired
    private IEmailService emailServ;
    
    @PostMapping("/new")
    public void agregarEmail (@RequestBody Email email){
        emailServ.crearEmail(email);
    }
    
    @GetMapping("/findAll")
    @ResponseBody
    public List<Email> verEmails(){
        return emailServ.verEmails();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarEmail (@PathVariable Long id){
        emailServ.borrarEmail(id);
    }
    
    @GetMapping("/findById/{id}")
    @ResponseBody
    public ResponseEntity<Email> buscarEmail (@PathVariable(value="id") Long id){
        return emailServ.buscarEmailId(id);
    }
    
    @PutMapping("edit")
    public void editarEmail (@RequestBody Email email){
        emailServ.editarEmail(email);
    }

}
