import java.util.Scanner;

public class exercicio24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int soma = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				soma += mat[i][j];
			}
		}

		// a soma dos elementos acima da diagonal principal

		System.out.println(soma);

		sc.close();
	}

}
