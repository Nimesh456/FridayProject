package com.qa.business.server;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.business.server.ClassroomService;

public class ClassroomServiceImplementation implements ClassroomService{

	private static final Logger LOGGER = Logger.getLogger(ClassroomService.class);
	
	@Inject
	private ClassroomService serv;
	
    
	public String addTrainer(String classroom) {
		return serv.addTrainer(classroom);
	}

	public String getTrainer() {
		LOGGER.info("In classroomserviceimplementation get all data");
		return serv.getTrainer();
	}
	
	public void setServ(ClassroomService serv) {
		this.serv = serv;
	}
	
	
	
	
}
