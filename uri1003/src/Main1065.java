import java.util.Scanner;

public class Main1065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();

		int a, b, c, d, e;
		if (n1 % 2 == 0) {
			a = 1;
		} else {
			a = 0;
		}

		if (n2 % 2 == 0) {
			b = 1;
		} else {
			b = 0;
		}

		if (n3 % 2 == 0) {
			c = 1;
		} else {
			c = 0;
		}

		if (n4 % 2 == 0) {
			d = 1;
		} else {
			d = 0;
		}

		if (n5 % 2 == 0) {
			e = 1;
		} else {
			e = 0;
		}

		int soma = a + b + c + d + e;
		System.out.println(soma + " valores pares");

		sc.close();
	}

}
