import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] numeros = new int[n];

		for (int i = 0; i < n; i++) {
			numeros[i] = sc.nextInt();
		}

		int quantidade = 0;

		for (int i = 0; i < n; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
				quantidade += 1;

			}
		}
		System.out.println();
		System.out.println(quantidade);
		sc.close();
	}

}
