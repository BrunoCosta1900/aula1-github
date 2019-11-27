import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (A < B && A < C) {
			System.out.println("MENOR = "+A);
		}
		
		else if (B < C) {
			System.out.println("MENOR = "+B);
		}
			else {
			System.out.println("MENOR = "+C);
			}
		
		
		sc.close();
	}
}
