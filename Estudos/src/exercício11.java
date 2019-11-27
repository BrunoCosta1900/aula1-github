import java.util.Locale;
import java.util.Scanner;

public class exercício11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vet = new double[n];
		
		for (int i = 0; i<n; i++) {
			vet[i] = sc.nextDouble();
		}
		
		double maior = 0.0;
		int position = 0;
		
		for (int i = 1; i<n; i++) {
			if(vet[i] > maior) {
				maior = vet[i];
				position = i;
			}
		}

		System.out.printf("%.1f%n", maior);
		System.out.println(position);
		
		sc.close();
	}

}
