package exercicioVetor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesVetor.ProgramaFuncionarios;

public class Funcionarios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas opera��es ser�o registradas?");

		int n = sc.nextInt();

		List<ProgramaFuncionarios> list = new ArrayList<ProgramaFuncionarios>();

		for (int i = 0; i < n; i++) {

			System.out.print("Id: ");
			sc.nextLine();
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome:");
			String nome = sc.nextLine();
			System.out.println("Sal�rio: ");
			double salario = sc.nextDouble();
			System.out.println();
			list.add(new ProgramaFuncionarios(id, nome, salario));
		}

		System.out.println();
		System.out.print("Digite o Id que deseja acresentar o sal�rio: ");

		int id = sc.nextInt();

		ProgramaFuncionarios prog = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (prog == null) {
			System.out.println("Id n�o existe");
		} else {
			System.out.print("Entre com a porcentagem: ");
			double porcentagem = sc.nextDouble();
			prog.novoSalario(porcentagem);
		}
		System.out.println();
		System.out.println("Lista: ");
		
		for (ProgramaFuncionarios obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}
