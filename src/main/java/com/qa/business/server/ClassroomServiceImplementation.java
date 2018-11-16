package com.qa.business.server;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.business.server.ClassroomService;
import com.qa.persistence.repository.ClassroomRepo;

public class ClassroomServiceImplementation implements ClassroomService{

	private static final Logger LOGGER = Logger.getLogger(ClassroomService.class);
	
	@Inject
	private ClassroomRepo serv;
	
    
	public String addTrainer(String classroom) {
		return serv.addTrainer(classroom);
	}

	public String getTrainer() {
		LOGGER.info("In classroomserviceimplementation get all data");
		return serv.getTrainer();
	}
	
	public void setServ(ClassroomRepo serv) {
		this.serv = serv;
	}

	public String updateTrainer(Long id, String classroom) {
		return serv.updateTrainer(id, classroom);
		
	}

	public String deleteTrainer(Long id) {
		return serv.deleteTrainer(id);
	}
	
	
	
	
}
