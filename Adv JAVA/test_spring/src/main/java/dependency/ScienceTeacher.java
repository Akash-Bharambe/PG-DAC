package dependency;

public class ScienceTeacher implements Teacher {
	public ScienceTeacher() {
		System.out.println("In constructor - " + getClass());
	}

	@Override
	public void teach() {
		System.out.println("Learn Science through experiments !");
	}

}
