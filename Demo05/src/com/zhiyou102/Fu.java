package com.zhiyou102;

public class Fu {
	
	static int count=3;
	int a=3;
	
	static{
		System.out.println("父类的静态代码块");
	}
	public Fu(){
		a=5;
		System.out.println("父类的构造方法");
		
	}
	public void display(){
		System.out.println("");
	}

}
