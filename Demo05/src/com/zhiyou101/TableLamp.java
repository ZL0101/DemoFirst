package com.zhiyou101;


class Table{
	public static  void on(Deng d){
		d.show();
	}
}
class Deng{
	public  void show(){
		
	}
}

class red extends Deng{
	public void show(){
		System.out.println("�����");
	}
	
}
class green extends Deng{
	public void show(){
		System.out.println("�̵���");
	}
}

public class TableLamp {
	public static void main(String[] args) {
		Table.on(new red());
		Table.on(new green());
	}
	

}
