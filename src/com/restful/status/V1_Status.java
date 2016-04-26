package com.restful.status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.restful.services.PersonService;

@Path ("/v1/status")
public class V1_Status {

	private StatusDao statusDao;
	private PersonService personService;

	private static final String api_version = "00.01.00";
	
	@GET
	@Produces (MediaType.TEXT_HTML)
	public String returnTitle()
	{
		System.out.println(statusDao);
		System.out.println(personService.findPerson(1));
		return "<p>Java Web Services</p> ";
	}
	
	@Path("/version")
	@GET
	@Produces (MediaType.TEXT_HTML)
	public String returnVersion()
	{
		return "<p>Version:</p>"+api_version;
	}

	public StatusDao getStatusDao() {
		return statusDao;
	}

	public void setStatusDao(StatusDao statusDao) {
		this.statusDao = statusDao;
	}

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
}
