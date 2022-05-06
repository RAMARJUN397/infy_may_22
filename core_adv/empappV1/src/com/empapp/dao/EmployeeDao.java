package com.empapp.dao;
import java.util.*;

import com.empapp.dto.EmployeeDTO;
public interface EmployeeDao {
	public List<EmployeeDTO> getAll();
	public EmployeeDTO getById(int id);
	public void addEmployee(EmployeeDTO employeeDTO);
	public void deleteEmployee(int id);
	public void updateEmployee(int id, Double salary);
}
