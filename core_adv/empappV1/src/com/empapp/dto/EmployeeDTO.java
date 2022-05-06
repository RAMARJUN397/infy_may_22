package com.empapp.dto;
//used to tranfer data bw the layer
public class EmployeeDTO {
	private int id ;
	private String name;
	private Double salary;
	private String dept;
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	//with id
	public EmployeeDTO(int id, String name, Double salary, String dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	public EmployeeDTO() {}
	
	//without id
	public EmployeeDTO(String name, Double salary, String dept) {
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	
}
