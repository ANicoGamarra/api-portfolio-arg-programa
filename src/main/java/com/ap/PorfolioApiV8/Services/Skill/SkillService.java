package com.ap.PorfolioApiV8.Services.Skill;

import java.util.List;
import java.util.Optional;

import com.ap.PorfolioApiV8.models.Skill;
import com.ap.PorfolioApiV8.repository.ISkillRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService {

    @Autowired
    public ISkillRepository skillRepo;

    @Override
    public List<Skill> verSkills() {
        return skillRepo.findAll();
    }

    @Override
    public void crearSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skill buscarSkill(Long id) {
        return skillRepo.findById(id).orElse(null);
    }

    @Override
    public ResponseEntity<Skill> buscarSkillId(Long id) {
        Optional<Skill> skill = skillRepo.findById(id);
        
        if(skill.isPresent()){
            return ResponseEntity.ok().body(skill.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public void editarSkill(Skill skill) {
        skillRepo.save(skill);
    }
    
}
