package non_generic;

public class Tester {

	public static void main(String[] args) {
		//create a holder to hold an int .
		Holder intHolder=new Holder(1000);//int --> Integer --> Object
		int data=(Integer)intHolder.getRef();//explict --downcasting, implicit --auto un boxing
		System.out.println(intHolder.getClass());//Holder
		System.out.println(intHolder.getRef().getClass());
		//create another  holder to hold a String
		Holder stringHolder=new Holder("12345");//String--> Object : up casting
		String s=(String) stringHolder.getRef();
		System.out.println(stringHolder.getClass());//Holder
		System.out.println(stringHolder.getRef().getClass());//String
		intHolder=stringHolder;
		data=(Integer)intHolder.getRef();//class cast exc.

	}

}
