import java.util.Locale;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horasTrabalhadas;
		double valorPorHora, salario;
		
		numero = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorPorHora = sc.nextDouble();
		
		salario = horasTrabalhadas * valorPorHora;
		
		
		
		System.out.println("NUMBER = " +numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}
