package dependency;

import org.springframework.stereotype.Component;

//singleton n eager
@Component("eng")
public class EnglishTeacher implements Teacher {
	public EnglishTeacher() {
		System.out.println("In constructor - " + getClass());
	}

	@Override
	public void teach() {
		System.out.println("Practice English Grammar");
	}

}
