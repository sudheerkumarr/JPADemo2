package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Skill {

	// Fields
	@Id
	@GeneratedValue
	private int skillId;
	
	private String skillName;
	
	// Constructors
	public Skill(){}
	
	public Skill(String name) {
		this.skillName=name;
	}
	
	public Skill(int skillId, String skillName) {
		this.skillId = skillId;
		this.skillName = skillName;
	}
	
	// Getters & Setters
	public int getSkillId() {
		return skillId;
	}
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", skillName=" + skillName + "]";
	}
	
	
	
}

