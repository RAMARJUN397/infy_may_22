package com.demo.E_factory_methods_in_collection;

import java.util.*;

public class A_Collections_unmodifiableCollection_Need {

	public static void main(String[] args) {

		// Creation of unmodifiable List/ Set object
		List<String> books = new ArrayList<String>();
		books.add("head fist");
		books.add("thinking in java");
		books.add("sprng in action");
		books.add("think and grow rich");
		books = Collections.unmodifiableList(books);

		// Creation of unmodifiable Set Object

		Set<String> booksSet = new HashSet<String>();
		booksSet.add("head fist");
		booksSet.add("thinking in java");
		booksSet.add("sprng in action");
		booksSet.add("think and grow rich");
		booksSet = Collections.unmodifiableSet(booksSet);

		// Creation of unmodifiable Map object

		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "Apple");
		map.put("B", "Banana");
		map.put("C", "Cat");
		map.put("D", "Dog");
		map = Collections.unmodifiableMap(map);

	}

}
