class TestPrimitiveTypeConversions
{
  public static void main(String[] args)
  {
	   byte b1=10;
	//   byte b2=128;//javac error : lossy conversion int --> byte
	byte b2=20;
	  byte b3=(byte)(b1+b2);//RHS : int --> byte
	  b1 += 15;//b1 =(byte) (b1+15) : type casting done implicitly by javac
	//  b1 = b1+15; //javac err !
	  double d1=123.456;
	  float f1=12.34f; //no javac err
	  long l1=12345678;
	  f1=l1;//no javac err
	  l1=f1;//javac err
  }
}