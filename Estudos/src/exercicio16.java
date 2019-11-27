import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];

		for (int i = 0; i < n; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();
		}

		int velha = idade[0];
		int posicao = 0;
		
		for (int i = 0; i < n; i++) {
			if (idade[i] > velha) {
				velha = idade[i];
				posicao = i;
			}

		}

		System.out.println("Pessoa mais velha: " + nome[posicao]);

		sc.close();
	}

}
