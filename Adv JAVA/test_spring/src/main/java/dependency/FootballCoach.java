package dependency;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    public FootballCoach() {
    	System.out.println("In constructor - " + getClass());
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in strength training n cardio";
    }
}
