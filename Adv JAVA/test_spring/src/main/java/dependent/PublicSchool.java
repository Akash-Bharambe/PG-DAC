package dependent;

import dependency.Coach;
import dependency.MathsTeacher;
import dependency.Teacher;
import lombok.Setter;

public class PublicSchool implements School {	
	private Teacher subjectTeacher;
	private Coach sportsCoach;
	
	//CTOR based Dependency Injection
	public PublicSchool(Teacher teacher) {
		subjectTeacher = teacher;
		System.out.println("In constructor - " + getClass());
	}

	@Override
	public void manageAcademics() {
		System.out.println("Managing academics here -");
		subjectTeacher.teach();
	}

	@Override
	public void organizeSportsEvent() {
		System.out.println("Organizing Event...!!!");
		System.out.println(sportsCoach.getDailyWorkout()); 
	}

	//Setter Based Dependency Injection
	public void setSportsCoach(Coach sportsCoach) {
		System.out.println("In Coach Setter");
		this.sportsCoach = sportsCoach;
	}
	
	
}
