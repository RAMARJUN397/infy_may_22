package com.demo.D_SafeVarargs_enh;

import java.util.*;
//javac -Xlint:unchecked A_Heap_pollution.java
public class A_Heap_pollution {

	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("A", "B");
		List<String> l2 = Arrays.asList("C", "D");
		m1(l1, l2);
	}

	public static void m1(List<String>... l) {
		Object[] a = l;// we can assign List[] to Object[]
		a[0] = Arrays.asList(10, 20);
		String name = (String) l[0].get(0);// String type pointing to Integer type

		System.out.println(name);
	}
}