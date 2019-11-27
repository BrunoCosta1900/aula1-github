package exercicioVetor;

import java.util.Locale;
import java.util.Scanner;

import entitiesVetor.Product;

public class exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(nome, price);
		}

		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPrice();
		}

		double media = soma / vect.length;
		System.out.printf("%.2f%n", media);

		sc.close();
	}

}
