package com.test.pacl;

public class Child extends Parent {
public void childClass() {
	System.out.println("Child Class created");

}
public static void main(String[] args) {
	Child a=new Child();
	a.childClass();
	a.parentclass();
}
}
