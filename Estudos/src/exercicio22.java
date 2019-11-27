import java.util.Locale;
import java.util.Scanner;

public class exercicio22 {

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

		double[] vet = new double[n];
	
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				vet[j]+= mat[i][j];
				
			}
		}

		System.out.println("Soma das colunas: ");
		for (int j = 0; j < n; j++) {
			System.out.printf("%.1f%n", vet[j]);
		}
		sc.close();
	}

}
