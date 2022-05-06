package com.empapp.service;

import java.util.List;

import com.empapp.dao.EmployeeDao;
import com.empapp.dao.EmployeeDaoImpl;
import com.empapp.dto.EmployeeDTO;
import com.empapp.validation.EmployeeValidation;
//it is the brain of ur application
public class EmployeeServiceImpl implements EmployeeService{
	//hey service layer look for dao layer: tight coupling :(
	private EmployeeDao dao=new EmployeeDaoImpl();
	private EmployeeValidation employeeValidation=new EmployeeValidation();
	
	@Override
	public List<EmployeeDTO> getAll() {
		return dao.getAll();
	}

	@Override
	public EmployeeDTO getById(int id) {
		return dao.getById(id);
	}

	@Override
	public void addEmployee(EmployeeDTO employeeDTO) {
		employeeValidation.isNameValid(employeeDTO.getName());
		dao.addEmployee(employeeDTO);
	}

	@Override
	public void deleteEmployee(int id) {
		dao.deleteEmployee(id);
	}

	@Override
	public void updateEmployee(int id, Double salary) {
		//i can do validation again
		dao.updateEmployee(id, salary);
	}

}
