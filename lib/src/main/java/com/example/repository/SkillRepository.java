package com.example.repository;

import com.example.entity.Skill;

public interface SkillRepository {
	Skill addSkill(Skill skill);
	Skill getSkillByName(String name);
}
