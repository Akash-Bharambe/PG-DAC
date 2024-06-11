package dependency;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Prototype, Derived Bean ID(footballCoach)
@Component
@Scope(value = "prototype")
public class FootballCoach implements Coach {

	public FootballCoach() {
		System.out.println("In constructor - " + getClass());
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes in strength training n cardio";
	}
}
