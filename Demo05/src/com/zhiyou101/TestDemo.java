package com.zhiyou101;

//�����౻abstract����
abstract class A{
	//�Ѿ�ʵ�ֵķ���
	public void eat(){
		System.out.println("A��eat����");
	}
	//δʵ�ֵķ�����Ҫʹ��abstract����
	public abstract void print();
	
}

class B extends A{
	public void eat(){
		System.out.println("B��eat����");
	}
	public void print(){
		System.out.println("B��print����");
	}
}

public class TestDemo {
	public static void main(String[] args){
		A a = new B();
		a.eat();
		a.print();
		
	}

}
