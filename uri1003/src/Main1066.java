import java.util.Scanner;

public class Main1066 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();

		int a, b, c, d, e;
		int a2, b2, c2, d2, e2;
		int a3, b3, c3, d3, e3, f3;
		int a4, b4, c4, d4, e4, f4;

		// par ou impar
		if (n1 % 2 == 0) {
			a = 1;
			a2 = 0;
		} else {
			a = 0;
			a2 = 1;
		}

		if (n2 % 2 == 0) {
			b = 1;
			b2 = 0;
		} else {
			b = 0;
			b2 = 1;
		}

		if (n3 % 2 == 0) {
			c = 1;
			c2 = 0;
		} else {
			c = 0;
			c2 = 1;
		}

		if (n4 % 2 == 0) {
			d = 1;
			d2 = 0;
		} else {
			d = 0;
			d2 = 1;
		}

		if (n5 % 2 == 0) {
			e = 1;
			e2 = 0;
		} else {
			e = 0;
			e2 = 1;
		}

		// POSITIVO
		if (n1 > 0) {

			a3 = 1;
		} else {

			a3 = 0;
		}
		if (n2 > 0) {

			b3 = 1;
		} else {

			b3 = 0;
		}

		if (n3 > 0) {

			c3 = 1;
		} else {

			c3 = 0;
		}

		if (n4 > 0) {

			d3 = 1;
		} else {

			d3 = 0;
		}

		if (n5 > 0) {

			e3 = 1;
		} else {

			e3 = 0;
		}

		// negativo
		if (n1 >= 0) {

			a4 = 0;
		} else {

			a4 = 1;
		}
		if (n2 >= 0) {

			b4 = 0;
		} else {

			b4 = 1;
		}

		if (n3 >= 0) {

			c4 = 0;
		} else {

			c4 = 1;
		}

		if (n4 >= 0) {

			d4 = 0;
		} else {

			d4 = 1;
		}

		if (n5 >= 0) {

			e4 = 0;
		} else {

			e4 = 1;
		}

		int par = a + b + c + d + e;
		System.out.println(par + " valor(es) par(es)");

		int impar = a2 + b2 + c2 + d2 + e2;
		System.out.println(impar + " valor(es) impar(es)");

		int positivo = a3 + b3 + c3 + d3 + e3;
		System.out.println(positivo + " valor(es) positivo(s)");

		int negativo = a4 + b4 + c4 + d4 + e4;
		System.out.println(negativo + " valor(es) negativo(s)");

		sc.close();
	}

}
