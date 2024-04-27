package util;

import static core.ValidationRules.validateAadhar;
import static core.ValidationRules.validateDOJ;
import static core.ValidationRules.validatePhoneNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import core.Employee;
import core.FullTimeEmployee;
import core.PartTimeEmployee;
import core.exception.EmployeeException;

public class Utils {

	private static Map<String, Employee> empMap;
	private static Scanner scanner = new Scanner(System.in);

	static {
		empMap = populateMap();
	}

	public static Map<String, Employee> populateMap() {
		Map<String, Employee> empMap = new HashMap<>();
		empMap.put("316320430620",
				new FullTimeEmployee("Akash Bharambe", "2024-08-19", "8411840325", "316320430620", 250500.50));
		empMap.put("234576549832",
				new PartTimeEmployee("Zing Ching", "2023-08-20", "9863436554", "234576549832", 50500.50));

		empMap.put("135792468012",
				new FullTimeEmployee("John Doe", "1990-05-15", "1234567890", "135792468012", 80000.00));
		empMap.put("246801357923",
				new PartTimeEmployee("Jane Smith", "1995-10-20", "9876543210", "246801357923", 30000.00));

		empMap.put("357912468024",
				new FullTimeEmployee("Michael Johnson", "1985-03-25", "2345678901", "357912468024", 85000.00));
		empMap.put("468013579035",
				new PartTimeEmployee("Emily Brown", "2000-07-12", "8765432109", "468013579035", 35000.00));

		empMap.put("579024680146",
				new FullTimeEmployee("David Lee", "1978-12-01", "3456789012", "579024680146", 90000.00));
		empMap.put("680135791257",
				new PartTimeEmployee("Emma Wilson", "1998-04-28", "7654321098", "680135791257", 32000.00));

		empMap.put("791246802368",
				new FullTimeEmployee("Christopher Davis", "1982-09-08", "4567890123", "791246802368", 82000.00));
		empMap.put("802357913479",
				new PartTimeEmployee("Olivia Taylor", "1992-06-03", "6543210987", "802357913479", 31000.00));

		empMap.put("913468024580",
				new FullTimeEmployee("Matthew Martinez", "1976-11-19", "5678901234", "913468024580", 87000.00));
		empMap.put("024579135691",
				new PartTimeEmployee("Sophia Anderson", "2002-02-14", "5432109876", "024579135691", 33000.00));
		return empMap;
	}

	private static Employee addEmployee() {

		System.out.print("Enter Aadhar Number: ");
		String aadharNumber = scanner.nextLine();
		validateAadhar(aadharNumber, empMap);

		System.out.print("Enter Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Phone Number: ");
		String phoneNumber = scanner.nextLine();
		validatePhoneNumber(phoneNumber);

		System.out.print("Enter Date of Joining(yyyy-mm-dd): ");
		String dateOfJoining = scanner.nextLine();
		validateDOJ(dateOfJoining);

		return new Employee(name, dateOfJoining, phoneNumber, aadharNumber);

	}

	public static void addFullTimeEmployee() {

		Employee employee = addEmployee();

		System.out.print("Enter Salary: ");
		double salary = scanner.nextDouble();

		empMap.put(employee.getAadhaarNumber(), new FullTimeEmployee(employee, salary));
		System.out.println("Full Time Employee added Successfully...!!!\n");
	}

	public static void addPartTimeEmployee() {

		Employee employee = addEmployee();

		System.out.print("Enter Fees: ");
		double fees = scanner.nextDouble();

		empMap.put(employee.getAadhaarNumber(), new PartTimeEmployee(employee, fees));
		System.out.println("Part Time Employee added Successfully...!!!\n");

	}

	public static void displayAllEmployee() {
		empMap.values().forEach(e -> System.out.println(e));
	}

	public static void deleteEmployee() {
		displayAllEmployee();

		System.out.print("\nEnter empid: ");
		int empID = scanner.nextInt();
		empMap.values().stream().filter(e -> e.getEmpID() == empID).map(e -> removeEmp(e)).toString();

		System.out.println("Employee Removed Successfully...!!!\n");
	}

	private static int removeEmp(Employee e) {
		empMap.remove(e.getAadhaarNumber(), e);
		return 0;
	}

	public static void searchEmpDetails() {

		System.out.print("Enter Aadhar Number: ");
		String aadharNumber = scanner.nextLine();
		validateAadhar(aadharNumber, empMap);

		if (empMap.containsKey(aadharNumber)) {
			System.out.println(empMap.get(aadharNumber));
		} else {
			throw new EmployeeException("Employee not found...!!!\n");
		}
	}

	public static void displayAllEmployeeSorted() {
		empMap.values().stream().sorted((e1, e2) -> e1.getDateOfJoining().compareTo(e2.getDateOfJoining()))
				.forEach(e -> System.out.println(e));
	}

	public static int menuList() {
		System.out.println("1. Add full time employee");
		System.out.println("2. Add part time employee");
		System.out.println("3. Delete an employee by Emp Id");
		System.out.println("4. Search employee details by Aadhaar number");
		System.out.println("5. Display all employee details");
		System.out.println("6. Display all employee details sorted by date of joining");
		System.out.println("Enter Choice: ");
		int ch = scanner.nextInt();
		scanner.nextLine();
		return ch;
	}

}
