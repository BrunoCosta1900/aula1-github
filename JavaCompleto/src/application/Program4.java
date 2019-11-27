package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		student.nome = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();

		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

		if (student.finalGrade() >= 60.00) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS %n", student.points());
		}

		sc.close();
	}

}