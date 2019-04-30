package com.test.pacl;

public class Overloading_Dharti {

	
	public void sumNumber(int a, int b) {
		int result = a+b;
		System.out.println("Addition of a and b is:"+result);

	}
	
	public void sumNumber(int a, int b, int c) {
		int result = a+b+c;
		System.out.println("Addition of a and b and c is:"+result);

	}
	
	public void multiplicationNumber(int a, double b) {
		double result = a*b;
		System.out.println("Multiplication of the number is:"+result);

	}
	
	public void multiplicationNumber(int a, int b, double c) {
		double result = a*b*c;
		System.out.println("Multiplication of the th enumber is:"+result);

	}
	
	public static void main(String[] args) {
		
		Overloading_Dharti obj = new Overloading_Dharti();
		obj.sumNumber(10, 20);
		obj.sumNumber(20, 30, 40);
		obj.multiplicationNumber(10, 1.0);
		obj.multiplicationNumber(2, 3, 3.1);
	}
}
	
	
	
