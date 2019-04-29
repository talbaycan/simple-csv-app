package com.albaycan.simplecsvapp;

import java.time.LocalDate;

public class Employee {

	private int id;
	private String name;
	private String surname;
	private int age;
	private String city;
	private String DOB;
	
	public Employee(int id, String name, String surname, int age, String city, String dOB) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.city = city;
		DOB = dOB;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}
	
	
	
	
}
