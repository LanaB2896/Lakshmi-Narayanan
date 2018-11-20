package com.demos.oops.packages.p1;

public class A {
	private static String privateVar = "private string variable";
	static String defaultVar = "default";
	protected String protectedVar = "protected string variable";
	public String publicvar = "public";

	private static String privateMethod() {
		String name = "gary";
		
		
		System.out.println("hello" + privateVar);
		return name;
	}

	void defaultMethod() {
		System.out.println("default()");
	}

	protected void protectedMethod() {
		System.out.println("protected()");
	}

	public void publicMethod() {
		System.out.println("public()");
	}

	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.privateVar);
		a.privateMethod();

	}
}
