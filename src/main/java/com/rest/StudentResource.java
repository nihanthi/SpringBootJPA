package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
	
@RestController
@RequestMapping(path = "/students")
public interface StudentResource {
	

	@GetMapping(path="/get",produces = "application/xml")
	public Students getStudents();
	
	@GetMapping(path="/get/{index}",produces = "application/xml")
	public Student getStudent(@PathVariable(name="index") int index );

	@PostMapping(value = "/add", consumes = { "application/xml", "application/json" }, produces = "application/soap+xml")
	//@JsonRequestMapping(value = "/override", method = PUT, produces = "text/plain")
	public Students addStudent(@RequestBody Student student);

}
