package com.zhiyou;


class AA{
	public void print(){
		System.out.println("AA的print方法");
	}
}

class BB extends AA{
	public void print(){
		System.out.println("BB的print方法");

	}
	public void eat(){
		System.out.println("BB的eat方法");

	}
}
class CC extends AA{
	public void print(){
		System.out.println("CC的print方法");

	}
	public void eat(){
		System.out.println("CC的eat方法");

	}
}



public class Test1 {

	public static void main(String[] args) {
		/*BB bb=new BB();
		bb.print();
		
		AA a=new BB();//向上转型，实例化的是子类对象
		a.print();//调用也是子类覆写的方法
*/	
		/*	向下转型
		AA a=new BB();//实例化子类对象先赋值给父类对象引用，让父类知道自己有这个孩子，即可正常转换
		BB b=(BB)a;
		b.print();*/
	
		
		/*//向上转型
		fun(new AA());//匿名使用
		fun(new BB());//此时我们传递的是BB对象，但是自动转化完成了类型转化
		fun(new CC());*/
		
		AA a=new AA();
		AA b=new BB();
		AA c=new CC();
		BB b2=(BB)b;
		a.print();
		b2.eat();
		b2.print();
		System.out.println(b2 instanceof AA);


	}
	//方法要求接受的是AA对象
	public static void fun(AA a){
		a.print();
		if(a instanceof BB){
			BB b=(BB)a;
			b.eat();
		}
	}
	
	
	
	
	
	
	

}
