package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Salario;

public class Program3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Salario salario = new Salario();

		salario.name = sc.nextLine();
		salario.grossSalary = sc.nextDouble();
		salario.tax = sc.nextDouble();

		System.out.println("Name: " + salario.name);
		System.out.printf("Gross salary: %.2f%n", salario.grossSalary);
		System.out.printf("Tax: %.2f%n", salario.tax);
		System.out.println();

		System.out.println("Employee: " + salario);
		System.out.println();

		System.out.println("Which percentage to increase salaary?");
		double percentage = sc.nextDouble();
		salario.increaseSalary(percentage);
		System.out.println();

		System.out.println("Updated data: " + salario);

		sc.close();
	}
}