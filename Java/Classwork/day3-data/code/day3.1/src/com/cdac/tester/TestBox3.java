//demo for ctor chaining
package com.cdac.tester;
import com.cdac.core.Box;
class TestBox3 {
 public static void main(String[] args) 
 {
	Box box1=new Box(1,2,3);
        Box cube=new Box(20);
        Box stdBox=new Box();
        System.out.println(box1.getBoxDimensions());
  	System.out.println(cube.getBoxDimensions());
  	System.out.println(stdBox.getBoxDimensions());
	Box box2=new Box(1,2,30);
	System.out.println(box1+" "+box2);
	System.out.println(box1.isEqual(box2)?"SAME":"DIFFERENT");
	//create a new box with dims modified w.r.t earlier box
	Box box3=box2.createNewBox(2,3,-5);
 	System.out.println(box3.getBoxDimensions());


	
 }
}