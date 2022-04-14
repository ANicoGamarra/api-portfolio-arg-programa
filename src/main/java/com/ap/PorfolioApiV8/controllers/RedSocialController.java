package com.ap.PorfolioApiV8.controllers;

import java.util.List;

import com.ap.PorfolioApiV8.Services.RedSocial.IRedSocialService;
import com.ap.PorfolioApiV8.models.RedSocial;

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
@RequestMapping("/api/redesSociales")
public class RedSocialController {

    @Autowired
    private IRedSocialService redSocialServ;

    @PostMapping("/new")
    public void agregarRedSocial(@RequestBody RedSocial redSoc) {
        redSocialServ.crearRedSocial(redSoc);
    }

    @GetMapping("/findAll")
    @ResponseBody
    public List<RedSocial> verRedSociales() {
        return redSocialServ.verRedSociales();
    }

    @DeleteMapping("/delete/{id}")
    public void borrarRedSocial(@PathVariable Long id) {
        redSocialServ.borrarRedSocial(id);
    }

    @GetMapping("/findById/{id}")
    @ResponseBody
    public ResponseEntity<RedSocial> buscarRedSocial(@PathVariable(value = "id") Long id) {
        return redSocialServ.buscarRedSocialId(id);
    }

    @PutMapping("edit")
    public void editarUsuario(@RequestBody RedSocial redSoc) {
        redSocialServ.editarRedSocial(redSoc);

    }
}
