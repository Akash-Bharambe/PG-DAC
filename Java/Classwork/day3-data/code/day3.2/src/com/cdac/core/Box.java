package com.cdac.core;
public class Box {
//state : non static data members : mem allocated in heap upon instance creation . Inited to def. values
//tight encap.
private double width;
private double depth;
private double height;
//how to init state of the object ? using parameterized ctor
 public Box(double w,double d,double height)
 {
    width=w;
	depth=d;
	//this => current / invoker object reference
	this.height=height;
 }
//create a cube
public Box(double side)
{
//  width=depth=height=side;
  this(side,side,side);
}
//create a std box : with all sides =10
public Box()
{
  this(10);
}
 //add a method : To return Box details (i.e dimensions of the Box) in a String form 
 public String getBoxDimensions() {
	 //this : OPTIONAL , added only for the understanding !
	  return "Box Dims are "+this.width+" "+this.depth+" "+this.height;
 }
 //add instance method to return computed volume of the box.
 public double getVolume() {
	  return width*depth*height;
 }
//add public non static method to chk equality of 2 boxes : for checking content equality : based upon dims
//b1.isEqual(b2) 
public boolean isEqual(Box anotherBox)
{
  System.out.println("In method "+this+" "+anotherBox);
  return this.width==anotherBox.width && this.depth==anotherBox.depth && this.height==anotherBox.height;

}
//add public instance method to create a new box with modified dims
public Box createNewBox(double wOff,double dOff,double hOff)
{
  Box newBox=new Box(this.width+wOff,this.depth+dOff,this.height+hOff);
  return newBox;
}





}