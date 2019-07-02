package com.zhiyou103;

public class Father {
	private String name="zhangjun";
	
	class child extends Father{
		public void intro(){
			System.out.println("This is child类的intro()方法"+name);
		}
	}

}
