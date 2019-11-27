import java.util.Locale;
import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] vet = new int[n];

		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextInt();
		}

		int soma = 0;
		double media = 0.0;
		int conta = 0;
		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				soma = soma + vet[i];
				conta = conta + 1;
				media = (double) soma / conta;
			}
		}

		System.out.printf("%.1f%n", media);

		sc.close();
	}

}
