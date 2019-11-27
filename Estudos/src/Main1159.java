
import java.util.Scanner;

public class Main1159 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		while (x != 0) {

			if (x % 2 != 0) {
				// se x for impar
				x += 1;
			}

			int soma = x + (x + 2) + (x + 4) + (x + 6) + (x + 8);

					System.out.println(soma);

			x = sc.nextInt();
		}
		sc.close();
	}

}
