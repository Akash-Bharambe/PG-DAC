package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import static utils.GenericUtils.*;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(l1);
		Collections.shuffle(l1);
		System.out.println(l1);
		Vector<String> strings=new Vector<>(Arrays.asList("one","two","three"));
		strings.add("four");
		//shuffle the strings : Collections.shuffle(List<?> list)
		Collections.shuffle(strings);
		System.out.println(strings);
		List<?> anyList=new ArrayList<>();
		System.out.println("printing list using ? ");
		printElements(l1);
		System.out.println("printing list using T ");
		printElements2(l1);
	}

}
