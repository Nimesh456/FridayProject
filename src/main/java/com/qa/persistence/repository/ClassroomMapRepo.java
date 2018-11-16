package com.qa.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import com.qa.business.server.ClassroomService;
import com.qa.classroom.classroom;
import com.qa.util.JSONUtil;

public class ClassroomMapRepo implements ClassroomRepo {
	@Inject
	private JSONUtil util;
	private final Long INITIAL_COUNT = 1L;
	private Map<Long, classroom> classroomMap;
	private Long ID;

	public ClassroomMapRepo() 
	{
		this.classroomMap = new HashMap<Long,classroom>();
		ID = INITIAL_COUNT;
		
	}

	public String addTrainer(String classroom) {
		ID++;
		classroom newClass = util.getObjectForJSON(classroom, classroom.class);
		classroomMap.put(ID, newClass);
		return classroom;
	}

	public String getTrainer() {
		return util.getJSONForObject(classroomMap.values());		
	}
	
	private void initAccountMap( ) 
	{
		classroom classroom = new classroom ((long)1, "John", "Smith");
		classroomMap.put(1L, classroom);
	}

	public String updateTrainer(Long id, String classroomToUpdate) {
		classroom newclassroom = util.getObjectForJSON(classroomToUpdate, classroom.class);
		classroomMap.put(id, newclassroom);
		return classroomToUpdate;
	}

	public String deleteTrainer(Long id) {
		classroomMap.remove(id);
		return "{\"message\": \"accout sucessfully removed\"}";
	}
}
