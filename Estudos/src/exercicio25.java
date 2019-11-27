import java.util.Scanner;

public class exercicio25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int[] maior = new int[n];

		for (int i = 0; i < n; i++) {
			maior[i] = 0;
			for (int j = 0; j < n; j++) {
				if (mat[i][j] > maior[i]) {
					maior[i] = mat[i][j];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(maior[i]);
		}

		sc.close();
	}

}
