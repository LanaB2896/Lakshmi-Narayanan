package com.demos.oops.packages.p2;

import com.demos.oops.packages.p1.A;

public class E extends A{
	public static void main(String[] args) {
		E e = new E();
		System.out.println(e.protectedVar);
		e.protectedMethod();
		
	}
}
