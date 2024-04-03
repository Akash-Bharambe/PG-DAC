import java.util.Scanner;
class TestBox {
 public static void main(String[] args) 
 {
	 int data=100;
    //sc : ref , RHS : object
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Box dims : w d h");
	Box b;//b : ref type var : class type , local var
	//local var : mem allotted on stack , no of bytes decided by JVM
	//System.out.println(b);//javac err !!!!
	b=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());//Box class loaded in method area n instance created on heap
	System.out.println(b);//no err ! o/p : NameOfClass@address => hash code
	//display dims
	System.out.println(b.getBoxDimensions());
	//display vol
	System.out.println("Volume "+b.getVolume());
	Box b2=b;//copy of refs
	System.out.println(b2.getBoxDimensions());//same as above
	b=null;//b is no longer referring to box object
//	How many objects are marked for GC ? 0
//System.out.println(b.getBoxDimensions());//java.lang.NullPointerException (NPE)
	System.out.println("cntd....");
	System.out.println(b2.getBoxDimensions());
	System.out.println("cntd again....");
	b2=null;
	//	How many objects are marked for GC ? 1
	//System.out.println(b2.getBoxDimensions()); NPE
	//System.out.println("cntd again 2");
	sc.close();
 }
}