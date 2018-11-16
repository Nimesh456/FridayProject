package com.qa.classroom;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class classroom {
	
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Id

	private Long id;
	private String Trainerfirstname;
	private String Trainersecondname;
	//private List<trainee> traineelist;
	
	public classroom(Long id, String trainerfirstname, String Trainersecondname) {
		super();
		this.id = id;
		this.Trainerfirstname = Trainerfirstname;
		this.Trainersecondname = Trainersecondname;
	}
	
	public classroom() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTrainerfirstname() {
		return Trainerfirstname;
	}

	public void setTrainerfirstname(String trainerfirstname) {
		Trainerfirstname = trainerfirstname;
	}

	public String getTrainersecondname() {
		return Trainersecondname;
	}

	public void setTrainersecondname(String trainersecondname) {
		Trainersecondname = trainersecondname;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", Trainerfirstname=" + Trainerfirstname + ", Trainersecondname=" + Trainersecondname + "]";
	}
	
	
	
	
}
