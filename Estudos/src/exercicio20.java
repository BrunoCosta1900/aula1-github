import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("DIAGONAL PRINCIPAL:");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
			System.out.println();
		}

		int quant = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					quant += 1;
				}
			}
		}

		System.out.println("QUANTIDADE DE NEGATIVOS = " + quant);

		sc.close();
	}

}
