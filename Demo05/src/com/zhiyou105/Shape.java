package com.zhiyou105;

public class Shape {
	double sum=0;//计算周长
	double area=0;//计算面积
	
	public static void main(String[] args) {
		Rect a = new Rect(2.00,2.60);
		System.out.println("周长为："+a.getZhouchang());
		Rect b = new Rect(2.00,2.60);
		System.out.println("面积为："+b.getMianji());
		
	}

}
