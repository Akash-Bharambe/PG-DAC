package dependency;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// Singleton and Lazy, id = swim
@Component("swim")
@Lazy(true)
public class SwimmingCoach implements Coach {

    public SwimmingCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }
}
