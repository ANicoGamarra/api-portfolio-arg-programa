package com.ap.PorfolioApiV8.controllers;

import java.util.List;

import com.ap.PorfolioApiV8.Services.Usuario.IUsuarioService;
import com.ap.PorfolioApiV8.models.Usuario;

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
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {
    
    @Autowired
    private IUsuarioService usuarioServ;
    
    @PostMapping ("/new")
    public void agregarUsuario (@RequestBody Usuario user){
        usuarioServ.crearUsuario(user);
    }
    
    @GetMapping("/findAll")
    @ResponseBody
    public List<Usuario> verUsuarios(){
        return usuarioServ.verUsuarios();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarUsuario (@PathVariable Long id){
        usuarioServ.borrarUsuario(id);
    }
    
    @GetMapping("/findById/{id}")
    @ResponseBody
    public ResponseEntity<Usuario> buscarUsuario(@PathVariable(value="id") Long id){
        return usuarioServ.buscarUsuarioId(id);
    }
    
    @PutMapping ("edit")
    public void editarUsuario (@RequestBody Usuario user){
        usuarioServ.editarUsuario(user);
    }

}
