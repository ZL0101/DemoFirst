package com.zhiyou;


class AA{
	public void print(){
		System.out.println("AA��print����");
	}
}

class BB extends AA{
	public void print(){
		System.out.println("BB��print����");

	}
	public void eat(){
		System.out.println("BB��eat����");

	}
}
class CC extends AA{
	public void print(){
		System.out.println("CC��print����");

	}
	public void eat(){
		System.out.println("CC��eat����");

	}
}



public class Test1 {

	public static void main(String[] args) {
		/*BB bb=new BB();
		bb.print();
		
		AA a=new BB();//����ת�ͣ�ʵ���������������
		a.print();//����Ҳ�����าд�ķ���
*/	
		/*	����ת��
		AA a=new BB();//ʵ������������ȸ�ֵ������������ã��ø���֪���Լ���������ӣ���������ת��
		BB b=(BB)a;
		b.print();*/
	
		
		/*//����ת��
		fun(new AA());//����ʹ��
		fun(new BB());//��ʱ���Ǵ��ݵ���BB���󣬵����Զ�ת�����������ת��
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
	//����Ҫ����ܵ���AA����
	public static void fun(AA a){
		a.print();
		if(a instanceof BB){
			BB b=(BB)a;
			b.eat();
		}
	}
	
	
	
	
	
	
	

}
