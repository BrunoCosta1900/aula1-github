import java.util.Locale;
import java.util.Scanner;

public class Main1064 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		double n5 = sc.nextDouble();
		double n6 = sc.nextDouble();

		int a, b, c, d, e, f;
		double x, y, z, w, k, l;
		if (n1 > 0) {
			a = 1;
			x = n1;
		} else {
			a = 0;
			x = 0;
		}

		if (n2 > 0) {
			b = 1;
			y = n2;
		} else {
			b = 0;
			y = 0;
		}

		if (n3 > 0) {
			c = 1;
			z = n3;
		} else {
			c = 0;
			z = 0;
		}

		if (n4 > 0) {
			d = 1;
			w = n4;
		} else {
			d = 0;
			w = 0;
		}

		if (n5 > 0) {
			e = 1;
			k = n5;
		} else {
			e = 0;
			k = 0;
		}
		if (n6 > 0) {
			f = 1;
			l = n6;
		} else {
			f = 0;
			l = 0;
		}

		int total = a + b + c + d + e + f;
		double total2 = x + y + z + w + k + l;
		double media = total2 / total;

		if (total == 0) {
			
		}
		else {
		System.out.println(total + " valores positivos");
		System.out.printf("%.1f%n", media);
		}
		sc.close();
	}

}
