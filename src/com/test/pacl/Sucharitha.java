package com.test.pacl;

public class Sucharitha {
public static void main(String[] args) {
	for (int i = 0; i < 100; i++) {
		int a,b=0,c=0;
		a=i;
		while(a>0){
			b=a%10;
			c=(c*10)+ b;
			a=a/10;
			if (i==c) {
				System.out.println(i);
				
			}
		}
		
	}
}
}
