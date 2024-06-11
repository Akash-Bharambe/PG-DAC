package com.tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependent.PublicSchool;

public class TestSpringContainer {

	public static void main(String[] args) {
		try( ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-config.xml") ) {
			System.out.println("Spring Container Running...!!!");
			
			PublicSchool mySchool = ctx.getBean("my_school", PublicSchool.class);
			
			mySchool.manageAcademics();
			mySchool.organizeSportsEvent();
			
			PublicSchool mySchool2 = ctx.getBean("my_school", PublicSchool.class);
			
			mySchool2.manageAcademics();
			System.out.println(mySchool == mySchool2);
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
