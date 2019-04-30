package com.test.pacl;

import java.util.Scanner;

public class Swaping_Dharti {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number for swapping:");
		System.out.println("Entter first number");
		int a=sc.nextInt();
		//System.out.println("First Number befor swapping is a: "+a);
		System.out.println("Enter Second number");
		int b = sc.nextInt();
		//System.out.println("Second Number befor swapping is b: "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("First Number after swapping is a: "+a);
		System.out.println("Second Number after swapping is b: "+b);
		
	}
}
	
	
	

