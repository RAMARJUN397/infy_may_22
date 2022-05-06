package com.empapp.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.empapp.dto.EmployeeDTO;
import com.empapp.exception.EmployeeNotFoundException;
import com.empapp.util.ConnectionFactory;
import com.empapp.validation.EmployeeValidation;

public class EmployeeDaoImpl implements EmployeeDao {

	private Connection connection;
	
	public EmployeeDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public List<EmployeeDTO> getAll() {
		List<EmployeeDTO> dtos = new ArrayList<EmployeeDTO>();
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from emp");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				// here i dont want to print it... i want get emp from rs and add to dtos list
				EmployeeDTO temp = new EmployeeDTO(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4));
				dtos.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dtos;
	}

	@Override
	public EmployeeDTO getById(int id) {
		// if emp is found retun that emp or else throw exception : empNotFoundEx
		System.out.println("---------------------");
		EmployeeDTO empDto = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from emp where id=?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				empDto = new EmployeeDTO(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (empDto == null)
			throw new EmployeeNotFoundException("emp with id " + id + " is not found");
		return empDto;
	}

	@Override
	public void addEmployee(EmployeeDTO employeeDTO) {
		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into emp(name,salary, dept) values (?,?,?)");// placeholder
			pstmt.setString(1, employeeDTO.getName());
			pstmt.setDouble(2, employeeDTO.getSalary());
			pstmt.setString(3, employeeDTO.getDept());

			pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void deleteEmployee(int id) {
		getById(id);
		try {
			PreparedStatement pstmt = connection.prepareStatement("delete from emp where id=?");// placeholder
			pstmt.setInt(1, id);

			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateEmployee(int id, Double salary) {
		//first check emp there or not if not there then u must throw exception
		getById(id);
		try {
			PreparedStatement pstmt = connection.prepareStatement("update emp set salary=? where id=?");// placeholder
			pstmt.setDouble(1, salary);
			pstmt.setInt(2, id);

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
