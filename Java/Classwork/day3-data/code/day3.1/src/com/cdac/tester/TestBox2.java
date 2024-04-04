package com.cdac.tester;
import com.cdac.core.Box;
class TestBox2 {
 public static void main(String[] args) 
 {
	 int data=100;    
	Box b1=new Box(10,20,30);
	Box b2=b1; //any objs marked for GC ?
	b2=new Box(1,2,3);
	System.out.println(b1.getBoxDimensions());
	b1=null; //any objs marked for GC ?
	b2=null; //any objs marked for GC ?
	
 }
}