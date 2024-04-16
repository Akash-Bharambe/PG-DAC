package custom_ordering;

import java.util.Comparator;

public class StringDescComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		System.out.println("in compare - ");
		return o2.compareTo(o1);
	}

}
