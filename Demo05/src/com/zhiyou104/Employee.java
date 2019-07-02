package com.zhiyou104;

 class Employee extends Person{
	 private String office;
	 private double salary;
	 
	 public Employee(){}
	 public Employee(String name,int age,String adress,
			 String office,double salary){
		 super(name,age,adress);
		 this.office=office;
		 this.salary=salary;
		 
	 }
	 
	 public String toString(){
		 return super.toString()+"office:"+office+"salary"+salary;
	 }
	 
	 
}
class Faculty extends Employee{
	private int level;
	public Faculty(){}
	public Faculty(String name,int age,String adress,
			 String office,double salary,int level){
		
		super(name,age,adress,office,salary);
		this.level=level;
		
	}
	public String toString(){
		return super.toString()+" level:"+level;
	}
	
}

class Staff   extends Employee{
	private String title;
	
	public Staff(){}
	public Staff(String name,int age,String adress,
			 String office,double salary,String title){
		
		super(name,age,adress,office,salary);
		this.title=title;
		
	}
	
	public String toString(){
		return super.toString()+" title:"+title;
	}
	
	
	
	
}