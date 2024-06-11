package tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependent.PublicSchool;

public class TestSC {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-config.xml")) {
			System.out.println("SC up n running !");
			// get public school bean from SC
			PublicSchool mySchool =
					ctx.getBean("my_school", PublicSchool.class);
			//invoke B.L -- runnig the school
			mySchool.manageAcademics();
			mySchool.organizeSportsEvent();
			PublicSchool mySchool2 =
					ctx.getBean("my_school", PublicSchool.class);
			System.out.println(mySchool==mySchool2);//f 
		

		} // JVM - ctx.close() => shut down of SC
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
