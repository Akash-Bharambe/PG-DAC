package com.app.tester;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.app.*;

public class Program {
	private static Scanner scanner = new Scanner(System.in);

	public static Person[] acceptRecord() {
		Person[] person = new Person[10];
		person[0] = new Teacher("Sandeep", 35, 1000.50, 10, LocalDate.parse("2018-02-14"));
		person[1] = new Teacher("Madhura", 45, 2050.50, 12, LocalDate.parse("2015-12-25"));
		person[2] = new Teacher("Saket", 50, 2450.50, 13, LocalDate.parse("2017-04-20"));
		person[3] = new Teacher("Sarfaraz", 30, 1450.50, 8, LocalDate.parse("2007-06-10"));
		person[4] = new Teacher("Sakshi", 18, 450.50, 7, LocalDate.parse("2005-04-18"));
		person[5] = new Student("Akash", 22, 14, LocalDate.parse("2002-06-26"));
		person[6] = new Student("Abhinav", 21, 4, LocalDate.parse("2003-04-25"));
		person[7] = new Student("Kiran", 23, 44, LocalDate.parse("2001-05-05"));
		person[8] = new Student("Rishi", 25, 15, LocalDate.parse("2000-11-12"));
		person[9] = new Student("Gaurav", 22, 20, LocalDate.parse("2000-10-14"));
		return person;
	}

	public static int menulist() {
		System.out.println("\nSort By...");
		System.out.println("0. EXIT");
		System.out.println("1. Name");
		System.out.println("2. Roll No");
		System.out.println("3. Salary");
		System.out.println("4. Employee Id");
		System.out.println("5. Age");
		System.out.println("6. Hire Date");
		System.out.println("7. Birth Date");
		System.out.print("Enter Choice: ");
		return scanner.nextInt();
	}

	public static void display(Person[] person, boolean studentFlag, boolean teacherFlag) {

		for (Person p : person) {
			if (teacherFlag && p instanceof Teacher) {
				System.out.println(p);
			} else if (studentFlag && p instanceof Student) {
				System.out.println(p);
			} else if(!studentFlag && !teacherFlag){
				System.out.println(p);
			}
		}
	}

	public static void main(String[] args) {
		Person[] person = acceptRecord();
		PersonType ch;
		while ((ch = PersonType.values()[menulist()]) != PersonType.EXIT) {
			boolean teacherFlag = false;
			boolean studentFlag = false;
			Comparator<Person> cp = null;
			System.out.println();
			switch (ch) {
			case NAME:
				cp = new NameComparator();
				System.out.println("Sorted by Name...");
				break;
			case ROLLNO:
				cp = new RollNoComparator();
				studentFlag = true;
				System.out.println("Sorted by Roll no...");
				break;
			case SALARY:
				cp = new SalaryComparator();
				teacherFlag = true;
				System.out.println("Sorted by Salary...");
				break;
			case EMPID:
				cp = new EmpIdComparator();
				teacherFlag = true;
				System.out.println("Sorted by Employee ID...");
				break;
			case AGE:
				cp = new AgeComparator();
				System.out.println("Sorted by Age...");
				break;
			case HIREDATE:
				cp = new HireDateComparator();
				teacherFlag = true;
				System.out.println("Sorted by Hire Date...");
				break;
			case BIRTHDATE:
				cp = new BirthDateComparator();
				studentFlag = true;
				System.out.println("Sorted by Birth Date...");
				break;
			default:
				Arrays.sort(person);
				display(person, studentFlag, teacherFlag);
				System.out.println();
				break;
			}
			Arrays.sort(person, cp);
			display(person, studentFlag, teacherFlag);
			System.out.println();
		}
	}
}
