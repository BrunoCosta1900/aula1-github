package application;

import java.util.Scanner;

import entities.Aluguel;

public class Pensionato {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Aluguel[] vect = new Aluguel[10];

		System.out.println("Quantos estudantes?");
		int estudantes = sc.nextInt();

		for (int i = 1; i <= estudantes; i++) {
			System.out.println("Aluguel n�mero " + i + ":");
			sc.nextLine();
			System.out.print("Digite o nome do estudante: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("N�mero do quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Aluguel(nome, email);
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println("Quarto n�mero" + i + ": " + vect[i]);
			}
		}

		sc.close();
	}

}
