package duplicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 6, 3, 6, 1 };
		Map<Integer, Integer> freqMap = new HashMap<>();
		List<Integer> list = new ArrayList<>();

		for (int i : array) {
			freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
		}
		
		
		for (Map.Entry<Integer,	Integer> entry : freqMap.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			if (val > 1) {
				list.add(key);
			}
		}
		if (list.isEmpty()) {
			list.add(-1);
		}
		Collections.sort(list);
		System.out.println(list);
	}

}
