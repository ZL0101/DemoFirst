package com.zhiyou101;

//饲养员喂食动物的方法

class WEi{
public void eat(){
		
	}
}
class JointPanda extends WEi{
	public void eat(){
		System.out.println("吃的是竹子");
	}
}
class Dog extends WEi{
	public void eat(){
		System.out.println("吃的是骨头");
	}
}
class Cat extends WEi{
	public void eat(){
		System.out.println("吃的鱼");
	}
}
class Test {
	
	

public static void main(String[] args){
	
	eat(new JointPanda());
	eat(new Dog());
	eat(new Cat());

}

public static void eat(WEi a){
	a.eat();
}




	
}
