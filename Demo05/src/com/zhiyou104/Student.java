package com.zhiyou104;

 class Student extends Person{
	 private int grade;
	 
	 public Student(String name,int age,String adress,int grade){
		 super(name,age,adress);
		 this.grade=grade;
	 }
	 
	 public String toString(){
		 
		 return super.toString()+" grade"+grade;
		 
	 }
	 

}
