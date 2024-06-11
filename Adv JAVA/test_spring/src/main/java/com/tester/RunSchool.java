package com.tester;

import dependency.FootballCoach;
import dependency.ScienceTeacher;
import dependent.PublicSchool;

public class RunSchool {

	public static void main(String[] args) {
		
		PublicSchool school = new PublicSchool(new ScienceTeacher());
		school.manageAcademics();
		
		school.setSportsCoach(new FootballCoach());
		school.organizeSportsEvent();
	}

}
