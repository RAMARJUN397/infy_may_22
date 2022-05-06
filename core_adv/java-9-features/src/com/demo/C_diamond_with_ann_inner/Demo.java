package com.demo.C_diamond_with_ann_inner;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// java 8
		ArrayList<String> l = new ArrayList<String>() {
		};

		// java 9
		ArrayList<String> l2 = new ArrayList<>() {
		};
	}
}
