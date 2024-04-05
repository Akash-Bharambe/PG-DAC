package tester;

import com.cdac.events.Faculty;
import com.cdac.events.Student;

public class Test2 {

	public static void main(String[] args) {
		//direct referencing : type of the ref n type of the instance : SAME
		Student s1=new Student("a1", "b1", 2023, "Java", 123456, 75);
		Faculty f1=new Faculty("a2", "b2", 10, "Java React DB");
		System.out.println(s1.getDetails());
		System.out.println(f1.getDetails());
	}

}
