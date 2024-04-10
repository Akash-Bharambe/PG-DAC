package tester;

import java.util.Scanner;
import static utils.VehicleValidationRules.validateSpeed;

public class TestValidateSpeed {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter current speed");
			validateSpeed(sc.nextInt());
			System.out.println("end of try...");
		} // JVM : sc.close() => clean up of the resources :std i/p stream
		catch (Exception e) {
			System.out.println(e);//name + err mesg
		}
		System.out.println("main over....");

	}

}
