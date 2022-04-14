package com.ap.PorfolioApiV8.Services.Skill;

import java.util.List;

import com.ap.PorfolioApiV8.models.Skill;

import org.springframework.http.ResponseEntity;

public interface ISkillService {
    
    public List<Skill> verSkills();
    
    public void crearSkill (Skill skill);
    
    public void borrarSkill (Long id);
    
    public Skill buscarSkill (Long id);   
    
    public ResponseEntity<Skill> buscarSkillId (Long id);
    
    public void editarSkill (Skill skill);

}
