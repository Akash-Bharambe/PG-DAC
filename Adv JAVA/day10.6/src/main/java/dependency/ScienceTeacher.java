package dependency;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ScienceTeacher implements Teacher {
	public ScienceTeacher() {
		System.out.println("In constructor - " + getClass());
	}

	@Override
	public void teach() {
		System.out.println("Learn Science through experiments !");
	}

}
