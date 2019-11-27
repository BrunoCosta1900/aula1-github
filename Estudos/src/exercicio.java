import java.util.Locale;
import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, notafinal;

		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();

		notafinal = nota1 + nota2;
		System.out.printf("NOTA FINAL = %.1f%n", notafinal);

		if (notafinal < 60.00) {
			System.out.println("REPROVADO");
		}

		sc.close();
	}

}
