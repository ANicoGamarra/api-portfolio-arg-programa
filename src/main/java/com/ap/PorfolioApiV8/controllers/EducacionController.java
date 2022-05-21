package com.ap.PorfolioApiV8.controllers;

import java.util.List;

import com.ap.PorfolioApiV8.Services.Educacion.IEducacionService;
import com.ap.PorfolioApiV8.models.Educacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/educaciones")
public class EducacionController {
    
     
    @Autowired
    private IEducacionService eduServ;
    
    @PostMapping ("/new")
    public void agregarEduacion (@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    @GetMapping("/findAll")
    @ResponseBody
    public List<Educacion> verEducaciones(){
        return eduServ.verEducaciones();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarEducaciones (@PathVariable Long id){
        eduServ.borrarEducacion(id);
    }
    
    @GetMapping("/findById/{id}")
    @ResponseBody
    public ResponseEntity<Educacion> buscarEducacion(@PathVariable(value="id") Long id){
        return eduServ.buscarEducacionId(id);
    }
    
    @PutMapping ("edit")
    public void editarExperiencia (@RequestBody Educacion edu){
        eduServ.editarEducacion(edu);
    }

}
