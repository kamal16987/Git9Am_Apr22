package com.test.pacl;

public class Prem1 {
	int a=123;
	int i=0,j=0;
	
	public void ReverseNumber(){
		
	 while(a>0){
		 i=a%10;
		 j=(j*10)+i;
		 a=a/10;
	 }
	 System.out.println(j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prem1 obj=new Prem1();
		obj.ReverseNumber();
		
		

	}

}
