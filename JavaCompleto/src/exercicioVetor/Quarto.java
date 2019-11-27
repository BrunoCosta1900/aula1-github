package exercicioVetor;

import java.util.Locale;
import java.util.Scanner;

import entitiesVetor.Aluguel;

public class Quarto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluguel[] vect = new Aluguel[10];

		System.out.println("Quantos estudantes?");
		int estudantes = sc.nextInt();

		for (int i = 1; i <= estudantes; i++) {
			System.out.println();
			System.out.println("Aluguel número " + i + ": ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Aluguel(nome, email);

		}
		System.out.println();
		System.out.println("Quartos alugados: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		sc.close();
	}

}
