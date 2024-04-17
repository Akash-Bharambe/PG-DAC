package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 4, 1, 3, 5, 6, 7, 6, 8, 2 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> out = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			map.put(arr[i], count);
			out.add(arr[i]);
		}

		Collections.sort(out, (o1, o2) -> {
			int freq = map.get(o2).compareTo(map.get(o1));
			return freq == 0 ? freq : o2.compareTo(o1);
		});
		
		out.forEach(i->System.out.println(i));
		
//		int out[] = new int[13];
//		int cnt = 0;
//		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			Integer key = entry.getKey();
//			Integer val = entry.getValue();
//			while (val != 0) {
//				out[cnt++] = key;
//				val--;
//			}
//		}
//		System.out.println(map);
//		for (int i = 0; i < out.length; i++) {
//
//			System.out.println(out[i]);
//		}
	}
}
