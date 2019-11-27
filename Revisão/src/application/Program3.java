package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Program3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco banco;

		System.out.println("N�mero da conta: ");
		int conta = sc.nextInt();
		sc.nextLine();

		System.out.println("Propriet�rio: ");
		String nome = sc.nextLine();
		System.out.println();

		System.out.println("Deseja fazer um deposito inicial (s/n)?");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.println("Quanto deseja depositar?");
			double depositoInicial = sc.nextDouble();
			banco = new Banco(conta, nome, depositoInicial);
		} else {
			banco = new Banco(conta, nome);
		}
		System.out.println(banco);
		System.out.println();

		System.out.println("Digite o valor a ser depositado: ");
		double deposito = sc.nextDouble();
		banco.deposito(deposito);
		System.out.println("Dados da conta atualizada: ");
		System.out.println(banco);
		System.out.println();

		System.out.println("Digite o valor a ser sacado: ");
		double saque = sc.nextDouble();
		banco.saque(saque);
		System.out.println("Dados da conta atualizada: ");
		System.out.println(banco);

		sc.close();
	}

}
