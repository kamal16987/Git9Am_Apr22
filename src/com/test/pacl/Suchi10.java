package com.test.pacl;

import java.util.Scanner;

public class Suchi10 {
	public static void main(String[] args) {
	String original, reverse="";
	System.out.println("Enter a String");
	Scanner s=new Scanner(System.in);
	original=s.nextLine();
	int length=original.length(); 
	
	for (int i = length-1; i >=0; i--) {
		reverse=reverse+original.charAt(i);
		
	}if (original.equals(reverse)) {
		System.out.println("palindrome");
		
	}else {
		System.out.println("not a palindrome");
	}

}}
