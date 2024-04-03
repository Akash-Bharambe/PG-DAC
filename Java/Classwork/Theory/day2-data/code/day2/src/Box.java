class Box {
//state : non static data members : mem allocated in heap upon instance creation . Inited to def. values
//tight encap.
private double width;
private double depth;
private double height;
//how to init state of the object ? using parameterized ctor
 Box(double w,double d,double height)
 {
    width=w;
	depth=d;
	//this => current / invoker object reference
	this.height=height;
 }
 //add a method : To return Box details (i.e dimensions of the Box) in a String form 
 String getBoxDimensions() {
	 //this : OPTIONAL , added only for the understanding !
	  return "Box Dims are "+this.width+" "+this.depth+" "+this.height;
 }
 //add instance method to return computed volume of the box.
 double getVolume() {
	  return width*depth*height;
 }
}