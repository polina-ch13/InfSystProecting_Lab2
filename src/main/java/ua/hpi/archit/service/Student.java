package ua.hpi.archit.service;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	private int ID;
	private String name;
	private int age;

	Student() {
	}

	Student(int ID, String name, int age) {
		this.ID = ID;
		this.name = name;
		this.age = age;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
