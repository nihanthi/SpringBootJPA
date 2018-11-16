package com.rest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@Component
@XmlRootElement(name = "students")
public class Students implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -213499376216960529L;

	private List<Student> listOfStudents = new ArrayList<>();

	public List<Student> getListOfStudents() {
		return listOfStudents;
	}

	public void setListOfStudents(List<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}

}
