package com.zhiyou101;

//抽象类被abstract修饰
abstract class A{
	//已经实现的方法
	public void eat(){
		System.out.println("A的eat方法");
	}
	//未实现的方法需要使用abstract修饰
	public abstract void print();
	
}

class B extends A{
	public void eat(){
		System.out.println("B的eat方法");
	}
	public void print(){
		System.out.println("B的print方法");
	}
}

public class TestDemo {
	public static void main(String[] args){
		A a = new B();
		a.eat();
		a.print();
		
	}

}
