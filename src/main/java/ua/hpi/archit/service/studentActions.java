package ua.hpi.archit.service;

public interface studentActions {
	void addStudent(int ID, String name, int age);
	void deleteStudent(int ID);
	void updateStudent(int ID, String name, int age);
	void printStudents();
}
