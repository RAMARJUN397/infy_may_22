package com.demo;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		//raj
		EmpApi api=new EmpApi();
		
		int id=1;
		Optional<String> nameOpt=api.getName(id);
		
//		String name=nameOpt.orElse("name is not found");
//		System.out.println(name);
		
		String name=nameOpt.orElseThrow(()-> new EmpNotFoundEx("emp with id :"+ id +" is not found"));
		System.out.println(name);
	}
}
