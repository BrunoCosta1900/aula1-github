import java.util.Scanner;

public class Main1101 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		while (m > 0 && n > 0) {

			int menor = n;
			int maior = m;

			if (n > m) {
				maior = n;
				menor = m;
			}
			int soma = 0;
			for (int i = menor; i <= maior; i++) {
				soma += i;
				System.out.print(i + " ");
			}
			System.out.println("Sum="+soma);

			m = sc.nextInt();
			n = sc.nextInt();
		}

		sc.close();
	}

}
