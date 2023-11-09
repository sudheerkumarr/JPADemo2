package com.example.service;

import com.example.entity.Skill;
import com.example.repository.SkillRepository;
import com.example.repository.SkillRepositoryImpl;

public class SkillServiceImpl implements SkillService {

	// Create skill repository obj
	SkillRepository skillRepo = new SkillRepositoryImpl();
	
	@Override
	public Skill addSkill(Skill skill) {
		Skill s = skillRepo.addSkill(skill);
		return s;
	}

}
