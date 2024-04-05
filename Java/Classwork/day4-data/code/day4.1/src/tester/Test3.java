package tester;

import com.cdac.events.Faculty;
import com.cdac.events.Person;
import com.cdac.events.Student;

public class Test3 {

	public static void main(String[] args) {
		// indirect referencing : type of the ref n type of the instance : DIFFERENT
		Person p;// super cls ref.
		// super cls ref --> sub class instance : any type casting required : NOT reqd
		// up casting : extends keyword
		p = new Student("a1", "b1", 2023, "Java", 123456, 75);
		System.out.println(p.getDetails());// student's getDetails : late binding => run time polymorphism
		p=new Faculty("a2", "b2", 10, "Java React DB");//up casting
		System.out.println(p.getDetails());//faculty's getDetails : run time poly.
	}

}
