package com.app;

import java.util.Comparator;

public class HireDateComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		if (p1 instanceof Teacher && p2 instanceof Teacher) {
			Teacher t1 = (Teacher) p1;
			Teacher t2 = (Teacher) p2;
			return t1.getHireDate().compareTo(t2.getHireDate());
		}
		return 0;
	}

}
