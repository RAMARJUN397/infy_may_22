package com.demo.F_streams_enhancements;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A_takeWhile {
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(2);
		l1.add(4);
		l1.add(1);
		l1.add(3);
		l1.add(6);
		l1.add(5);
		l1.add(8);
		System.out.println("Initial List:" + l1);
		List<Integer> l2 = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("After Filtering:" + l2);
		List<Integer> l3 = l1.stream().takeWhile(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("After takeWhile:" + l3);
		
		Stream.of("A","AA","BBB","CCC","CC","C")
		.takeWhile(s->s.length()<=2)
		.forEach(System.out::println);
	}
}
