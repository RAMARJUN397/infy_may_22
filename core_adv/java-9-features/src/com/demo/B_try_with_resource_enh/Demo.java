package com.demo.B_try_with_resource_enh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		try (br) {

		} catch (IOException e) {

		}
	}
}
