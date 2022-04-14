package com.ap.PorfolioApiV8.controllers;

import java.util.List;

import com.ap.PorfolioApiV8.Services.Experiencia.IExperienciaService;
import com.ap.PorfolioApiV8.models.Experiencia;

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
@RequestMapping("/api/experiencias")
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService expServ;
    
    @PostMapping ("/new")
    public void agregarExperiencia (@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
    }
    
    @GetMapping("/findAll")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return expServ.verExperiencias();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarExperiencia (@PathVariable Long id){
        expServ.borrarExperiencia(id);
    }
    
    @GetMapping("/findById/{id}")
    @ResponseBody
    public ResponseEntity<Experiencia> buscarExperiencia(@PathVariable(value="id") Long id){
        return expServ.buscarExperienciaId(id);
    }
    
    @PutMapping ("edit")
    public void editarExperiencia (@RequestBody Experiencia exp){
        expServ.editarExperiencia(exp);
    }

}
