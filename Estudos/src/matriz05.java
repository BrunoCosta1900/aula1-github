import java.util.Scanner;

public class matriz05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] matA = new int[m][n];
		int[][] matB = new int[m][n];

		
		//primeiro ler a matriz A
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matA[i][j] = sc.nextInt();

			}
		}

		// depois lê a matriz B
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matB[i][j] = sc.nextInt();
			}
		}

		//gera a matriz C
		int[][] matC = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matC[i][j] = matA[i][j] + matB[i][j];

			}
		}
		
		//Lê a matriz C
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matC[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
