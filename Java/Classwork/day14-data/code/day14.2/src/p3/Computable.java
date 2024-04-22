package p3;

@FunctionalInterface
public interface Computable {
	// javac : public abstract
	double compute(double a, double b);
	//javac : public 
	static void show() {
		System.out.println("in i/f static method");
	}
	//javac : public 
	default String getDetails() {
		return "some details";
	}
}
