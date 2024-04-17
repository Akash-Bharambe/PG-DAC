package freqSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> out = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 4, 1, 3, 5, 6, 7, 6, 8, 2));
		for (Integer integer : out) {
			map.put(integer, map.getOrDefault(integer, 0) + 1);
		}

		Collections.sort(out, (o1, o2) -> {
			int freq = map.get(o1).compareTo(map.get(o2));
			return freq == 0 ? o1.compareTo(o2) : freq;
		});

		out.forEach(i -> System.out.print(i + " "));

	}
}
