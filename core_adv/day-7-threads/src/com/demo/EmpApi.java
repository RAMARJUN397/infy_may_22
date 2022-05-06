package com.demo;

import java.util.*;

public class EmpApi {
	public Optional<String> getName(int id) {
		if (id == 1)
			return Optional.ofNullable(null);
		else
			return Optional.ofNullable("foo");
	}
}
