package com.demo.E_factory_methods_in_collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class B_Collections_unmodifiableCollection_List_Set {

	public static void main(String[] args) {

		// Creation of unmodifiable List/ Set object= Java 9 way
		List<String> booksList = 
				List.of("head fist", "thinking in java", "sprng in action", "think and grow rich");
		Set<String> booksSet = 
				Set.of("head fist", "thinking in java", "sprng in action", "think and grow rich");

		//1. can not add any new values 
		
		
		//2. null is not allowed in the unmodifiable list 
		List<String> fruits = List.of("Apple","Banana",null); //NPEx
	}

}






