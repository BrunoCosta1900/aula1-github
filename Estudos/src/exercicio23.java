import java.util.Scanner;

public class exercicio23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("VALORES NEGATIVOS:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					System.out.println(mat[i][j]);
				}
			}
		}

		sc.close();
	}

}
