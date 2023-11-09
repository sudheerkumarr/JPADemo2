package com.example.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.example.entity.Skill;

public class SkillRepositoryImpl implements SkillRepository {

	@Override
	public Skill addSkill(Skill skill) {
		// create entity manager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em= emf.createEntityManager();
		
		// begin transaction
		em.getTransaction().begin();
		
		// using entity manager persist() method save object in the db
		em.persist(skill);
		
		// commit transaction
		em.getTransaction().commit();
		
		
		// close entity manager
		em.close();
		emf.close();
		
		// return skill object
		return skill;
	}

	@Override
	public Skill getSkillByName(String name) {
		// create entity manager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em= emf.createEntityManager();

		// Get skill by name
		// HQL - Hibernate Query Language
		// Query query = em.createQuery('FROM Skill s WHERE s.skillName=:name');
		// query.setParameter("name", name);
		
		// JPQL - Java Persistence Query Language
		Query query = em.createQuery("select s from Skill s where s.skillName=:name");
		query.setParameter("name", name);
		
		Skill s =(Skill)query.getSingleResult();
		
		// close entity manager
		em.close();
		emf.close();
				
		return s;
	}

}
