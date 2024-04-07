package com.app;

import java.util.Comparator;

public class RollNoComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		Student t1 = null, t2 = null;
		if (p1 instanceof Student && p2 instanceof Student) {
			t1 = (Student) p1;
			t2 = (Student) p2;
			return Integer.compare(t1.getRollno(), t2.getRollno());
		}
		return 0;
	}
}
