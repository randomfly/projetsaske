package com.ib.trainingrs.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.ib.trainingcommon.ac.ICourseAC;
import com.ib.trainingcommon.bo.Course;

@Component
@Path("/formation")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class CourseService {

	private ICourseAC courseAC = null;

	public ICourseAC getCourseAC() {
		return courseAC;
	}

	public void setCourseAC(ICourseAC courseAC) {
		this.courseAC = courseAC;
	}

	public CourseService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("{id}")
	public Course getLivre(@PathParam("id") Integer id) {
		Course course = courseAC.get(id);
		return course;
	}

	@GET
	@Path("/formations")
	public List<Course> findAll() {
		List<Course> courses = courseAC.findAll();
		return courses;
	}

	@DELETE
	@Path("{id}")
	public String delete(@PathParam("id") Integer id) {
		Course course = new Course(id, null, null, null);
		courseAC.delete(course);
		return "ok";
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	public String ajouter(Course course) {
		courseAC.save(course);
		return "ok";
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	public String update(Course course) {
		courseAC.update(course);
		return "ok";
	}
	
	
}