package com.zhiyou101;

//����Աιʳ����ķ���

class WEi{
public void eat(){
		
	}
}
class JointPanda extends WEi{
	public void eat(){
		System.out.println("�Ե�������");
	}
}
class Dog extends WEi{
	public void eat(){
		System.out.println("�Ե��ǹ�ͷ");
	}
}
class Cat extends WEi{
	public void eat(){
		System.out.println("�Ե���");
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
