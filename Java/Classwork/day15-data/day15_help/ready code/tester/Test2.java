package tester;
import static utils.EmployeeUtils.getAllEmployees;

import java.util.List;

import com.app.core.Employee;
public class Test2 {

	public static void main(String[] args) {
		//Hiring agency has data from different orgs
		List<List<Employee>> allEmployees = getAllEmployees();
		//Display names of all developers from above collection

	}

}
