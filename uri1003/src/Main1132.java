import java.util.Scanner;

public class Main1132 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int maior = x;
		int menor = y;

		if (x < y) {
			maior = y;
			menor = x;
		}

		int soma = 0;
		for (int i = menor; i <= maior; i++) {
			if (i % 13 != 0) {
				soma = soma + i;
			}
		}

		System.out.println(soma);

		sc.close();

	}
}
