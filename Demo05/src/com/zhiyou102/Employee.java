package com.zhiyou102;

 class Employee extends Role{
	 static int ID;
	 private int salary;
	 
	
	
	public Employee(){
		 System.out.println("这是Employee的无参构造函数");

	 }
	 public Employee(int salary){
		 super();
		 this.salary=salary;
		 System.out.println("这是Employee的有参构造函数");
		 
	 }
	 
	 
	 public int getMoney() {
		return salary;
	}
	public void setMoney(int salary) {
		this.salary = salary;
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		 System.out.println("这是Employee的play()函数");

		
	}
	
	final public void sing(){
		System.out.println("I'm SING");
	}
	
	
	
	
	
	
	

}
