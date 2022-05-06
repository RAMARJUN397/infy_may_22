package com.demo.E_factory_methods_in_collection;

import java.util.Map;

public class C_Collections_unmodifiableCollection_Map {

	public static void main(String[] args) {
		/*
		 * Up to 10 entries,it is recommended to use of() methods and for more than 10
		 * items we should use ofEntries() method.
		 */

		Map<String, String> map = Map.of("A", "Apple", "B", "Banana", "C", "Cat", "D", "Dog");

		/*
		 * How to use Map.ofEntries() method: Map interface contains static Method
		 * entry() to create immutable Entry objects
		 */
		Map.Entry<String, String> e = Map.entry("A", "Apple");
		/*
		 * This Entry object is immutable and we cannot modify its content. If we are
		 * trying to change we will get RE: UnsupportedOperationException
		 */
		e.setValue("coder");// UnsupportedOperationException

		Map.Entry<String, String> e1 = Map.entry("A", "Apple");
		Map.Entry<String, String> e2 = Map.entry("B", "Banana");
		Map.Entry<String, String> e3 = Map.entry("C", "Cat");
		Map<String, String> m = Map.ofEntries(e1, e2, e3);
		System.out.println(m);

		// In Short way we can also create as follows.

		Map<String, String> map2 = Map
				.ofEntries(Map.entry("A", "Apple"), Map.entry("B", "Banana"),
				Map.entry("C", "Cat"), Map.entry("D", "Dog"));
	}

}
