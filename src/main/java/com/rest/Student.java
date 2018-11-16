package com.rest;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@Component
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "student")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3441107417302663736L;

	@XmlElement(name = "firstName")
	private String firstName;

	@XmlAttribute(name = "id2")
	private int id;

	@XmlElement(name = "lastName2")
	private String lastName;

	public Student() {
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", id=" + id + ", lastName=" + lastName + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Student(String firstName, int id, String lastName) {
		super();
		this.firstName = firstName;
		this.id = id;
		this.lastName = lastName;
	}

}
