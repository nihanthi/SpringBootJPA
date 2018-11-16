package com.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResourceImpl implements StudentResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(StudentResourceImpl.class);

	@Autowired
	private static Students students ;

	@Override
	public Students getStudents() {
		LOGGER.info("{}", "I got..");
		return students;
	}

	@Override
	public Students addStudent(@RequestBody Student student) {
		LOGGER.info("{}", "I got..");
		students.getListOfStudents().add(student);
		return students;
	}

	@Override
	public Student getStudent(@PathVariable(name="index") int index ) {
		return students.getListOfStudents().get(index);
	}

	
	static{
		students = new Students();
		students.getListOfStudents().add(new Student("Srinivas",12345,"Seshapu"));
		
	}
}
