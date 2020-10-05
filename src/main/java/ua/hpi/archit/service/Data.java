package ua.hpi.archit.service;

import java.util.ArrayList;

public class Data implements studentActions{

	private Student newS;
	private ArrayList<Student> std;
	
	Data (){
		std = new ArrayList();
	}
	
	@Override
	public void addStudent(int ID, String name, int age) {
		newS = new Student(ID, name, age);
		std.add(newS);
	}

	@Override
	public void deleteStudent(int ID) {
		for(int i=0; i<std.size(); i++) {
			if(std.get(i).getID()==ID) {
				std.remove(i);
				break;
			}
		}
	}

	@Override
	public void updateStudent(int ID, String name, int age) {
		for(int i=0; i<std.size(); i++) {
			if(std.get(i).getID()==ID) {
				std.get(i).setID(ID);
				std.get(i).setName(name);
				std.get(i).setAge(age);
				break;
			}
		}
		
	}

	@Override
	public void printStudents() {
		for(int i=0; i<std.size(); i++) {
			System.out.println(std.get(i).getID()+ " " + std.get(i).getName() + " " + std.get(i).getAge());
		}
		
	}

}
