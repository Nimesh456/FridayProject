package com.qa.business.server;

public interface ClassroomService {

	String addTrainer(String classroom);
	String getTrainer();
	String updateTrainer(Long id, String classroom);
	String deleteTrainer(Long id);	
}
