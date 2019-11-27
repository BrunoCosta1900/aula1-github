import java.util.Locale;
import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2, numeroDePecas1, numeroDePecas2;
		double valorUnitario1, valorUnitario2, valorPagar;
		
		codigo1 = sc.nextInt();
		numeroDePecas1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		
				
		codigo2 = sc.nextInt();
		numeroDePecas2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		
		valorPagar = (numeroDePecas1 * valorUnitario1)+(numeroDePecas2 * valorUnitario2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagar);
		
		sc.close();
		
	}

}
