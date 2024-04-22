package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.app.core.Employee;

public interface EmployeeUtils {
	static List<List<Employee>> getAllEmployees() {
		List<Employee> appleEmps = new ArrayList<>(Arrays.asList(new Employee(100, "Riya", "Developer", "Apple", 85000),
				new Employee(200, "Rama", "Team Lead", "Apple", 80000),
				new Employee(300, "Mihir", "Dev Ops Eng", "Apple", 57000)));
		List<Employee> samsungEmps = new ArrayList<>(
				Arrays.asList(new Employee(400, "Shekhar", "Developer", "Samsung", 60000),
						new Employee(500, "Kirti", "Data Scientist", "Samsung", 70000),
						new Employee(500, "Shubham", "Developer", "Samsung", 74000)));
		//You can add more orgs here....
		return List.of(appleEmps, samsungEmps);
	}
}
