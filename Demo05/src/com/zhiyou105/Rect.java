package com.zhiyou105;

class Rect extends Shape {
	double length;
	double width;

	public Rect(){}
	
	public Rect(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	
	public double getZhouchang(){
		sum=(width+length)*2;
		return sum;
	}
	public double getMianji(){
		area=width*length;
		return area;
	}
	
	
	
	
	

}
