package wrappers;

public class TestWrappers {

	public static void main(String[] args) {
		//Integer i1=new Integer(100); //boxing
		Integer i1=Integer.valueOf(100);//boxing : prim --> Wrapper
		int data=i1.intValue();//un boxing : wrapper --> prim
		Integer i2=12345;//auto boxing i2=Integer.valueOf(12345)
		data=i2;//auto un boxing , data=i2.intValue()
//		String s="12345";
//		s++;
		i2++;//auto un boxing(Integer->int) , inc , int --> Integer
		System.out.println(i2);
		Double d1=123.456;//auto boxing
		float f1=23.45f;//NO CONVERSION
		double d=f1;//widening float --> double
		//d1=f1;//auto boxing (float --> Float) ---X--- Double : peer classes
		d1=(double) f1;//RHS : double --> auto boxing --> Double
		Number n1=123.456F;//float --> Float (auto boxing) --> up casting --> Number
		System.out.println(n1.getClass());//java.lang.Float
		n1=12345;
		System.out.println(n1.getClass());//java.lang.Integer
		Object o=12345f;//auto boxing --> up casting
		System.out.println(o.getClass());//java.lang.Float
		o=true;
		o=12.3456;
		o=new String("dfsgad");//upcasting
		System.out.println(o.getClass());//java.lang.String
	}

}
