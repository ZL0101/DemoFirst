package com.zhiyou102;

 class Employee extends Role{
	 static int ID;
	 private int salary;
	 
	
	
	public Employee(){
		 System.out.println("����Employee���޲ι��캯��");

	 }
	 public Employee(int salary){
		 super();
		 this.salary=salary;
		 System.out.println("����Employee���вι��캯��");
		 
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
		 System.out.println("����Employee��play()����");

		
	}
	
	final public void sing(){
		System.out.println("I'm SING");
	}
	
	
	
	
	
	
	

}
