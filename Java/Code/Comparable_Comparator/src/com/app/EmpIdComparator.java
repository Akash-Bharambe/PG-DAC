package com.app;

import java.util.Comparator;

public class EmpIdComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		Teacher t1 = null, t2 = null;
		if (p1 instanceof Teacher && p2 instanceof Teacher) {
			t1 = (Teacher) p1;
			t2 = (Teacher) p2;
			return Integer.compare(t1.getEmpid(), t2.getEmpid());
		}
		return 0;
	}

}
