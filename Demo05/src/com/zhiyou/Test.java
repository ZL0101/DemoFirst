package com.zhiyou;

abstract class A{
	String name;
	public A(String name){
		this.name=name;
		System.out.println("抽象类A的构造方法");
	}
	public abstract void print();
}
class B extends A{
	public B(){
		super("");
		System.out.println("子类B的构造方法");
	}
	
	public void print() {
		System.out.println("B的print方法");
	}			
}

public class Test {
	public static void main(String[] args){
		A a=new B();
		a.print();
	}

}
