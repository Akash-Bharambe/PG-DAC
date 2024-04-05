package tester;

import com.cdac.events.Faculty;
import com.cdac.events.Student;

public class TestToSring2 {

	public static void main(String[] args) {
		// indirect referencing : type of the ref n type of the instance : DIFFERENT
		Object p;// super cls ref.
		// super cls ref --> sub class instance : any type casting required : NOT reqd
		// up casting : extends keyword
		p = new Student("a1", "b1", 2023, "Java", 123456, 75);
		System.out.println(p);//p.toString() : Student's toString
		p=new Faculty("a2", "b2", 10, "Java React DB");//up casting
		System.out.println(p);//p.toString : Faculty's toString
	}

}
