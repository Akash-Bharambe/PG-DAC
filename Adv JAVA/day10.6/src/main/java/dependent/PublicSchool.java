package dependent;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dependency.Coach;
import dependency.Teacher;

//singleton n eager
@Component("my_school")
public class PublicSchool implements School {
	@Autowired // Field level D.I = byType
	@Qualifier("scienceTeacher")
	private Teacher subjectTeacher; //sc teacher 
	@Autowired // Field level D.I = byType
	@Qualifier("cricket")
	private Coach sportsCoach; //cricket coach

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
		System.out.println("organize a sports event !");
		System.out.println(sportsCoach.getDailyWorkout());
	}

	// custom init n destry methods
	@PostConstruct
	public void anyInit() {
		System.out.println("in init");
	}

	@PreDestroy
	public void anyDestroy() {
		System.out.println("in destroy");
	}

}
