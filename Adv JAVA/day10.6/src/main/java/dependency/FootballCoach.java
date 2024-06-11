package dependency;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//prototype , derived bean id

@Component
@Scope(value="prototype")
//<bean id="footballCoach" class="...." scope="prototytpe"/>
public class FootballCoach implements Coach {

    public FootballCoach() {
    	System.out.println("In constructor - " + getClass());
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in strength training n cardio";
    }
}
