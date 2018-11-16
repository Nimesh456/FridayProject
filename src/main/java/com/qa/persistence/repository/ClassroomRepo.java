package com.qa.persistence.repository;

public interface ClassroomRepo {
	String addTrainer(String classroom);
	String getTrainer();
	String updateTrainer(Long id, String classroomToUpdate);
	String deleteTrainer(Long id);

}
