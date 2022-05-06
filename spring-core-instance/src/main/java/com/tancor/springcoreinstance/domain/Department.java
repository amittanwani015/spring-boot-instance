package com.tancor.springcoreinstance.domain;

public class Department {

	private String departmentName;
	private Employee employee;

	public Department(Employee employee) {
		super();
		this.setEmployee(employee);
	}

	@Override
	public String toString() {
		return "Department [employee=" + getEmployee().hashCode() + "]";
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}		
}
