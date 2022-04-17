package com.ap.PorfolioApiV8.controllers;

import java.util.List;

import com.ap.PorfolioApiV8.Services.Proyecto.IProyectoService;
import com.ap.PorfolioApiV8.models.Proyecto;

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

@RestController
@RequestMapping("/api/proyectos")
@CrossOrigin(origins = "*")
public class ProyectoController {

    @Autowired
    private IProyectoService proyecServ;
    
    @PostMapping ("/new")
    public void agregarProyecto (@RequestBody Proyecto proyec){
        proyecServ.crearProyecto(proyec);
    }
    
    @GetMapping("/findAll")
    @ResponseBody
    public List<Proyecto> verProyectos(){
        return proyecServ.verProyectos();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarProyecto (@PathVariable Long id){
        proyecServ.borrarProyecto(id);
    }
    
    @GetMapping("/findById/{id}")
    @ResponseBody
    public ResponseEntity<Proyecto> buscarProyecto (@PathVariable(value="id") Long id){
        return proyecServ.buscarProyectoId(id);
    }
    
    @PutMapping ("edit")
    public void editarProyecto (@RequestBody Proyecto proyec){
        proyecServ.editarProyecto(proyec);
    }
    
}
