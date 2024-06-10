package com.app.tester;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

import com.app.utils.HibernateUtils;

public class Tester {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtils.getFactory()) {
			System.out.println("Hibernate Running...");
		} catch (HibernateException e) {
			e.printStackTrace();
		};
	}

}
