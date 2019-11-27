import java.util.Scanner;

public class somaDeDiagonal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int[] vet = new int[n];

		
		for (int i = 0; i < n; i++) {
			int soma = 0;
			for (int j = 0; j < n; j++) {
				soma = soma + mat[i][j];
			}
			vet[i] = soma;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%d%n", vet[i]);
		}

		sc.close();
	}

}
