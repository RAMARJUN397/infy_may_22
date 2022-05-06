package com.empapp.controller;
import java.util.*;

import com.empapp.dto.EmployeeDTO;
import com.empapp.exception.EmployeeNotFoundException;
import com.empapp.service.EmployeeService;
import com.empapp.service.EmployeeServiceImpl;

public class Tester {

	public static void main(String[] args) {
		EmployeeService employeeService=new EmployeeServiceImpl();
		
		//1. get all records
		//List<EmployeeDTO> dtos=employeeService.getAll();
		//dtos.forEach(e-> System.out.println(e));
		
		//2. get a particaular emp
		
	//	EmployeeDTO empDto=employeeService.getById(11);
	//	System.out.println(empDto);
		
		//3. update the emp
		
		//employeeService.updateEmployee(2, 2200000.00);
		
		//4. add new emp
		employeeService.addEmployee(new EmployeeDTO("a", 670000.00, "sales"));
//		//delete the rec
//		try{
//			employeeService.deleteEmployee(4);
//		}catch(EmployeeNotFoundException ex) {
//			System.out.println(ex.getMessage());
//		}
	}
}
