import java.util.Locale;
import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vetA = new double[n];

		double soma = 0.0;
		double media = 0.0;
		for (int i = 0; i < n; i++) {
			vetA[i] = sc.nextDouble();
			soma = (double) soma + vetA[i];
			media = (double) soma / n;
		}

		System.out.printf("%.3f%n", media);

		for (int i = 0; i < n; i++) {
			if (vetA[i] < media) {
				System.out.printf("%.1f%n", vetA[i]);
			}
		}

		sc.close();
	}

}
