package com.tancor.springcoreinstance.domain;

public class Employee {

	private String name;
	private String city;

	public Employee(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + "]";
	}
}
