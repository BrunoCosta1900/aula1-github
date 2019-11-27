import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp = 's';
		
		while (resp != 'n') {
		System.out.println("Digite temperatura Celsius");
		double C = sc.nextDouble();
		double F = 9.0 * C / 5.0 + 32.0;
		System.out.printf("Fahrenheit: %.1f%n", F);
		System.out.println("repetir (s/n)? ");
		resp = sc.next().charAt(0);
		}
		
		// OU 
		
		/*
		 char resp; 
		 do{
		System.out.println("Digite temperatura Celsius");
		double C = sc.nextDouble();
		double F = 9.0 * C / 5.0 + 32.0;
		System.out.printf("Fahrenheit: %.1f%n", F);
		System.out.println("repetir (s/n)? ");
		resp = sc.next().charAt(0);
		}
		 	while char resp != 'n';
		 */
		sc.close();
	}

}
