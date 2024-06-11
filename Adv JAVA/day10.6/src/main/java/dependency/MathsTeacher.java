package dependency;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("maths")
@Lazy(true)
public class MathsTeacher implements Teacher {
	public MathsTeacher() {
		System.out.println("In constructor - " + getClass());
	}

	@Override
	public void teach() {
		System.out.println("Know your tables well !");
	}

}
