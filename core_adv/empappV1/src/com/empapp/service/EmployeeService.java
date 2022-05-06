package com.empapp.service;

import java.util.List;

import com.empapp.dto.EmployeeDTO;

public interface EmployeeService {
	public List<EmployeeDTO> getAll();
	public EmployeeDTO getById(int id);
	public void addEmployee(EmployeeDTO employeeDTO);
	public void deleteEmployee(int id);
	public void updateEmployee(int id, Double salary);
}
