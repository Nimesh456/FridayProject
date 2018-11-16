package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.business.server.ClassroomService;
import com.qa.classroom.classroom;
import com.qa.util.JSONUtil;

@Default
@Transactional(SUPPORTS)
public class ClassroomDBrepo implements ClassroomService {

	@Inject
	private JSONUtil util;
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	public String getTrainer() {
		Query query = manager.createQuery("Select m from classroom m");
		Collection<classroom> classrooms = (Collection<classroom>) query.getResultList();
		return util.getJSONForObject(classrooms);
	}

	@Transactional(REQUIRED)
	public String addTrainer(String classroom) {
		classroom addClassroom = util.getObjectForJSON(classroom, classroom.class);
		manager.persist(addClassroom);
		return "{\"message\": \"sucessfully added\"}";
	}
	
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}
}
