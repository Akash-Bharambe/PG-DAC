class TestBox2 {
 public static void main(String[] args) 
 {
	 int data=100;    
	Box b1=new Box(10,20,30);
	Box b2=b1; //any objs marked for GC ? none 
	b2=new Box(1,2,3);//b2 --> 2nd box obj
	//any objs marked for GC ? NO
	b1=null; //any objs marked for GC ? YES --1st box (10,20,30) 
	b2=null; //any objs marked for GC ? 2
	
 }
}