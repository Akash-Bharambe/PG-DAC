package com.app.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.Getter;

public class HibernateUtils {
	@Getter private static SessionFactory configuration;
	
	static {
		configuration = new Configuration().configure().buildSessionFactory();
	}
	
}
