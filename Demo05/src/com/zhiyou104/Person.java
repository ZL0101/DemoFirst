package com.zhiyou104;

public class Person {
	private String name;
	private int age;
	private String adress;
	public Person(){}
	
	public Person(String name,int age,String adress){
		this.name=name;
		this.age=age;
		this.adress=adress;
		
	}
	public String toString(){
		return "name:"+this.name+" age:"+this.age+" adress"+this.adress;
	}

}
