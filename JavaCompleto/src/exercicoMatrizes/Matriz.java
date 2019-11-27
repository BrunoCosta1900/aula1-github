package exercicoMatrizes;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Diagonal principal: ");
		for (int i = 0; i < mat[i].length; i++) {
			System.out.print(mat[i][i] + " ");
		}

		System.out.println();
		System.out.print("Negativos: ");

		int cont = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					System.out.print(mat[i][j]+ " ");
					cont++;
				}
			}
		}
		System.out.println();
		System.out.println("Total de negativos: "+ cont);

		sc.close();
	}

}