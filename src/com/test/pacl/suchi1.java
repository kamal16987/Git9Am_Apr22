package com.test.pacl;

import java.util.Scanner;

public class suchi1 {public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int a,i=0,j=0;
int n=s.nextInt();
a=n;
while (a>0) {
	i=a%10;
	j=(j*10)+i;
	a=a/10;}
	System.out.println(j);
	
}
	
	
}


