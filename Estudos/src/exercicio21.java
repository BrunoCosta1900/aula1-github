import java.util.Locale;
import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		double[][] mat = new double[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		double[] vet = new double[m];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				vet[i] += mat[i][j];
			}
		}
		
		System.out.println("Soma das linhas: ");
		for (int i = 0; i < m; i++) {
			System.out.printf("%.1f%n", vet[i]);
		}
		sc.close();
	}

}
