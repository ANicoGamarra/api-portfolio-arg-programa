package com.ap.PorfolioApiV8.controllers;

import java.util.List;

import com.ap.PorfolioApiV8.Services.Skill.ISkillService;
import com.ap.PorfolioApiV8.models.Skill;

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
@RequestMapping("/api/skills")
@CrossOrigin(origins = "*")
public class SkillController {

    @Autowired
    private ISkillService skillServ;
    
    @PostMapping ("/new")
    public void agregarSkill (@RequestBody Skill skill){
        skillServ.crearSkill(skill);
    }
    
    @GetMapping("/findAll")
    @ResponseBody
    public List<Skill> verSkills(){
        return skillServ.verSkills();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarSkill (@PathVariable Long id){
        skillServ.borrarSkill(id);
    }
    
    @GetMapping("/findById/{id}")
    @ResponseBody
    public ResponseEntity<Skill> buscarExperiencia(@PathVariable(value="id") Long id){
        return skillServ.buscarSkillId(id);
    }
    
    @PutMapping ("edit")
    public void editarSkill (@RequestBody Skill skill){
        skillServ.editarSkill(skill);
    }
    
}
