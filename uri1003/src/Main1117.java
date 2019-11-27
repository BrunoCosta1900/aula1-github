import java.util.Locale;
import java.util.Scanner;

public class Main1117 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota = sc.nextDouble();
		while (nota < 0 || nota > 10) {
			System.out.println("nota invalida");
			nota = sc.nextDouble();
		}
		double nota2 = sc.nextDouble();
		while (nota2 < 0 || nota2 > 10) {
			System.out.println("nota invalida");
			nota2 = sc.nextDouble();
		}

		double media = (nota + nota2) / 2;
		System.out.printf("media = %.2f%n", media);

		sc.close();
	}

}
