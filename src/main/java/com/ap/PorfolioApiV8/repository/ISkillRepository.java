package com.ap.PorfolioApiV8.repository;

import com.ap.PorfolioApiV8.models.Skill;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillRepository extends JpaRepository<Skill, Long> {

}
    

