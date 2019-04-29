package com.test.pacl;

import java.util.Scanner;

public class Sudharsana_SwappingNos {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("the Numbers are");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The Swapping nos are");
		System.out.println(a);
		System.out.println(b);
	}
	}
