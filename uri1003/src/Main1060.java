import java.util.Locale;
import java.util.Scanner;

public class Main1060 {

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
		if(n1 > 0) {
			a = 1;
		}
			else {
				a = 0;
			}
		if(n2 > 0) {
			b = 1;
		}
			else {
				b = 0;
			}
		
		if(n3 > 0) {
			c = 1;
		}
			else {
				c = 0;
			}
		
		if(n4 > 0) {
			d = 1;
		}
			else {
				d = 0;
			}
		
		if(n5 > 0) {
			e = 1;
		}
			else {
				e = 0;
			}
		
		if(n6 > 0) {
			f = 1;
		}
			else {
				f = 0;
			}
		
		int valor = a+b+c+d+e+f;
		System.out.println(valor+ " valores positivos");

		sc.close();
	}

}
