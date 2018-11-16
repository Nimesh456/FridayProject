package com.qa.classroom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class trainee {
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Id

	private Long id;
	private String Traineefirstname;
	private String Traineesecondname;
	
	public trainee(Long id, String Traineefirstname, String Traineesecondname) {
		super();
		this.id =  id;
		this.Traineefirstname = Traineefirstname;
		this.Traineesecondname = Traineesecondname;
	}
	
	public trainee()
	{
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTraineefirstname() {
		return Traineefirstname;
	}

	public void setTraineefirstname(String traineefirstname) {
		Traineefirstname = traineefirstname;
	}

	public String getTraineesecondname() {
		return Traineesecondname;
	}

	public void setTraineesecondname(String traineesecondname) {
		Traineesecondname = traineesecondname;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", Trainerfirstname=" + Traineefirstname + ", Trainersecondname=" + Traineesecondname + "]";
	}

}
