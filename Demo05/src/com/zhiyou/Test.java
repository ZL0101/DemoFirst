package com.zhiyou;

abstract class A{
	String name;
	public A(String name){
		this.name=name;
		System.out.println("������A�Ĺ��췽��");
	}
	public abstract void print();
}
class B extends A{
	public B(){
		super("");
		System.out.println("����B�Ĺ��췽��");
	}
	
	public void print() {
		System.out.println("B��print����");
	}			
}

public class Test {
	public static void main(String[] args){
		A a=new B();
		a.print();
	}

}
