package com.empapp.validation;

import java.util.regex.Pattern;

import com.empapp.exception.ValidationExcetion;

public class EmployeeValidation {

		//0
	public  boolean isIdValid(int id) {
		if(id<0)
			throw new ValidationExcetion("id is not allowed "+ id);
		return id>0;	//5>0
	}

	public  boolean isNameValid(String name) {
		boolean status=Pattern.matches("[a-zA-Z]{4,20}", name);
		if(!status)
			throw new ValidationExcetion("name "+ name +" is not valid");
		return status;
	}

	public  boolean isSalaryValid(Double salary) {
		return salary>=100000;
	}
	public  boolean isDeptValid(String dept) {
		//IT, sales, mkt,fin
		return true;
	}
}
