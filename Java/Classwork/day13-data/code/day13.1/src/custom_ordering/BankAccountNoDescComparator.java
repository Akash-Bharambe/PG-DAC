package custom_ordering;

import java.util.Comparator;

public class BankAccountNoDescComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		System.out.println("in compare");
		return o2.compareTo(o1);
	}
	

}
