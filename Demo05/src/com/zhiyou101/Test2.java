package com.zhiyou101;


abstract class AAA{
	public abstract void print();
	
	private static class BBB extends AAA{
		
		public void print() {
			System.out.println("hello");
					
		}
		
	}
	public static AAA getInstance(){
		return new BBB();
	}
}
public class Test2 {
	public static void main(String[] args) {
//		AAA a =AAA.getInstance();
//		a.print();
		AAA.getInstance().print();
	}

}
