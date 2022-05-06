package com.demo.D_SafeVarargs_enh;

import java.util.List;

public class C_SafeVarargs_private_method_enhancement {
	@SafeVarargs // valid
	public  C_SafeVarargs_private_method_enhancement(List<String>... l) {
	}

	@SafeVarargs // valid
	public static void m1(List<String>... l) {
	}

	@SafeVarargs // valid
	public final void m2(List<String>... l) {
	}

	@SafeVarargs // valid in Java 9 but not in Java 8
	private void m3(List<String>... l) {
	}
}
