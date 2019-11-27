import java.util.Locale;
import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();
			altura[i] = sc.nextDouble();
		}

		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma = soma + altura[i];
		}

		double alturaMedia = soma / n;
		System.out.printf("Altura média: %.2f%n", alturaMedia);

		int cont = 0;
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				cont++;
			}
		}

		double porcento = cont * 100.0 / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcento);

		sc.close();
	}

}
