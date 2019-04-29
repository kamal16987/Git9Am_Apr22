package com.test.pacl;

public class Overloading {
public void Same(int a) {
	System.out.println(a);
}
public void Same(String s){
	
	System.out.println(s);
}
public static void main(String[] args) {
	Overloading o=new Overloading();
	o.Same(12345);
	o.Same("alex");
}
}