package generic;

public class Tester {

	public static void main(String[] args) {
		// create a holder to hold an int .
		Holder<Integer> intHolder = new Holder<>(12345);// auto boxing int --> Integer
		int data = intHolder.getRef();// no need of explicit down casting , impl auto un boxing(Integer --> int)
		// create a holder to hold an String .
		Holder<String> stringHolder=new Holder<>("1234567");//NO conversion
		String s=stringHolder.getRef();
		intHolder=stringHolder;
	}

}
