package com.qa.integration;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.business.server.ClassroomService;

@Path("/classroom")

public class Endpoint {
	@Inject
	private ClassroomService service;
	
	@Path ("/json")
	@GET
	@Produces ({"application/json"})
	public String getTrainer() 
	{
		return service.getTrainer();
	}

	@Path("/json")
	@POST
	@Produces({ "application/json" })
	public String addTrainer(String classroom) {
		return service.addTrainer(classroom);
	}
	
	public void setService(ClassroomService service) {
		this.service = service;
	}
}
