package com.app;

public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person() {
		this("Akash", 21);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	@Override
	public int compareTo(Person p1) {
		return this.age - p1.age;
	}

	@Override
	public String toString() {
		return "[ "+ name + " \t" + age;
	}

}
