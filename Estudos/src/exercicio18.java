import java.util.Locale;
import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] sexo = new char[n];

		for (int i = 0; i < n; i++) {
			altura[i] = sc.nextDouble();
			sexo[i] = sc.next().charAt(0);
		}

		double menorAltura = altura[0];
		for (int i = 0; i < n; i++) {
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		System.out.printf("Menor altura = %.2f%n", menorAltura);

		double maiorAltura = altura[0];
		for (int i = 0; i < n; i++) {
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
		}

		System.out.printf("Maior altura = %.2f%n", maiorAltura);

		double soma = 0.0;
		int mulheres = 0;
		for (int i = 0; i < n; i++) {
			if (sexo[i] == 'F') {
				soma = soma + altura[i];
				mulheres++;
			}
		}

		int homens = 0;
		for (int i = 0; i < n; i++) {
			if (sexo[i] == 'M') {
				homens++;
			}
		}

		double media = soma / mulheres;
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		System.out.println("Numero de homens = " + homens);

		sc.close();
	}

}
