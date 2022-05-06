package com.demo.D_SafeVarargs_enh;

import java.util.*;

public class B_No_Heap_pollution {
	public static void main(String[] args) {

		List<String> l1 = Arrays.asList("A", "B");
		List<String> l2 = Arrays.asList("C", "D");
		m1(l1, l2);
	}

	@SafeVarargs
	public static void m1(List<String>... l) {
		for (List<String> l1 : l) {
			System.out.println(l1);
		}
	}
}