package DTO;

import java.util.Date;

public class employeeDto {
	private String employeeID; 
	private String name;
	private String DOB;
	private Double salary;
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	
	
	@Override
	public String toString() {
		return "employeeDto [employeeID=" + employeeID + ", name=" + name + ", DOB=" + DOB + ", salary=" + salary + "]";
	}
	public employeeDto(String employeeID, String name, String dOB, Double salary) {
		super();
		this.employeeID = employeeID;
		this.name = name;
		DOB = dOB;
		this.salary = salary;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public employeeDto() {
		
	}
}