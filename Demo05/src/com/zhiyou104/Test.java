package com.zhiyou104;

public class Test {

	public static void main(String[] args) {
		
		Person p=new Person("zl",22,"10001");
		System.out.println(p.toString());
		Person p1=new Student("zl",22,"10002",2);
		System.out.println(p1.toString());
		Person p2=new Employee("zl",11," 码农"," 计算机",160000.00);
		System.out.println(p2.toString());
		Person p3=new Faculty("zl",11," 码农"," 计算机",160000.00,6);
		System.out.println(p3.toString());
		Person p4=new Staff("zl",11," 码农"," 计算机",160000.00," 16");
		System.out.println(p4.toString());
		
		
		
		

	}

}
