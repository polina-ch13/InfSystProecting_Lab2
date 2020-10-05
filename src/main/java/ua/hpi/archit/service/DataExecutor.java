package ua.hpi.archit.service;

import java.util.Random;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DataExecutor {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(dataConfig.class);
		studentActions stda = (studentActions) ctx.getBean("studentData");
		Scanner sc = new Scanner(System.in);

		boolean f = true;
		int opt, i = 1;

		while (f) {
			System.out.println("Выберите действие:");
			System.out.println("1. Добавить студента");
			System.out.println("2. Удалить студента");
			System.out.println("3. Обновить информацию о студенте");
			System.out.println("4. Вывести список студентов");
			System.out.println("5. Завершить");
			opt = sc.nextInt();
			switch (opt) {
			case 1:
				stda.addStudent(sc.nextInt(), sc.next(), sc.nextInt());
				i++;
				break;
			case 2:
				stda.deleteStudent(sc.nextInt());
				i++;
				break;
			case 3:
				stda.updateStudent(sc.nextInt(), sc.next(), sc.nextInt());
				i++;
				break;
			case 4:
				stda.printStudents();
				i++;
				break;
			default:
				f = false;
				break;
			}
		}
	}

}
