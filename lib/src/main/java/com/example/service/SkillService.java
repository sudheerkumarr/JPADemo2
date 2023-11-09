package com.example.service;

import com.example.entity.Skill;

public interface SkillService {

	int x=100; // public, static final - SkillService.x
	Skill addSkill(Skill skill); // public, abstract
}
