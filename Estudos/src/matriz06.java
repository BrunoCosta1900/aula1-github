import java.util.Scanner;

public class matriz06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[][] mat = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		System.out.println("SOMA DOS POSITIVOS: ");
		double soma = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] > 0) {
					soma += mat[i][j];
				}
			}
		}
		System.out.println(soma);

		// System.out.println("Escolha a LINHA de 0 a " + (n - 1));

		int linha = sc.nextInt();
		System.out.print("LINHA ESCOLHIDA: ");
		for (int j = 0; j < n; j++) {
			System.out.print(mat[linha][j] + " ");
		}
		System.out.println();

		// System.out.println("Escolha a COLUNA de 0 a " + (n - 1));

		int coluna = sc.nextInt();
		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][coluna] + " ");
		}
		System.out.println();

		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		System.out.println("MATRIZ ALTERADA: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					mat[i][j] = Math.pow(mat[i][j], 2.0);
				}
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
