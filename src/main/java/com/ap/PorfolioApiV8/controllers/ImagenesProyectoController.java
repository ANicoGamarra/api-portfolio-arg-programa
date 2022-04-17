package com.ap.PorfolioApiV8.controllers;

import java.util.List;

import com.ap.PorfolioApiV8.Services.ImagenesProyecto.IImagenesProyectoService;
import com.ap.PorfolioApiV8.models.ImagenesProyecto;

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
@RequestMapping("/api/imagenesProyectos")
@CrossOrigin(origins = "*")
public class ImagenesProyectoController {
    
    @Autowired
    private IImagenesProyectoService imagenProyecServ;

    @PostMapping ("/new")
    public void agregarImagenProyecto (@RequestBody ImagenesProyecto imgProyec){
        imagenProyecServ.crearImagenProyecto(imgProyec);
    }
    
    @GetMapping("/findAll")
    @ResponseBody
    public List<ImagenesProyecto> verImagenesProyecto(){
        return imagenProyecServ.verImagenesProyecto();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarImagenProyecto(@PathVariable Long id){
        imagenProyecServ.borrarImagenProyecto(id);
    }
    
    @GetMapping("/findById/{id}")
    @ResponseBody
    public ResponseEntity<ImagenesProyecto> buscarImagenProyecto (@PathVariable(value="id") Long id){
        return imagenProyecServ.buscarImagenProyectoId(id);
    }
    
    @PutMapping ("edit")
    public void editarImagenProyecto (@RequestBody ImagenesProyecto imgProyec){
        imagenProyecServ.editarImagenProyecto(imgProyec);
    }

}
