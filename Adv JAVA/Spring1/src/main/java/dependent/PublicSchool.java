package dependent;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dependency.Coach;
import dependency.Teacher;
import lombok.Setter;

//Singleton and Eager

@Setter
@Component("my_school")
public class PublicSchool implements School {

	@Autowired // Field level DI = byType
	@Qualifier("scienceTeacher")
	private Teacher subjectTeacher;

	@Autowired // Field level DI = byType
	@Qualifier("cricket")
	private Coach sportsCoach;

	public PublicSchool() {
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

	public void setSportsCoach(Coach sportsCoach) {
		System.out.println("In Coach Setter");
		this.sportsCoach = sportsCoach;
	}

	@PostConstruct
	public void anyInit() {
		System.out.println("In init");
	}

	@PreDestroy
	public void anyDestroy() {
		System.out.println("In destroy");
	}

}
