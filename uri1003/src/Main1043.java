import java.util.Locale;
import java.util.Scanner;

public class Main1043 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N1 = sc.nextDouble();
		double N2 = sc.nextDouble();
		double N3 = sc.nextDouble();
		
		double A, B, C;
		if (N1 > N2 && N1 > N3) {
			A = N1;
			if (N2 > N3) {
				B = N2;
				C = N3;
			} else {
				B = N3;
				C = N2;
			}
		}

		else if (N2 > N3) {
			A = N2;
			if (N1 > N3) {
				B = N1;
				C = N3;
			} else {
				B = N3;
				C = N1;

			}

		} else {
			A = N3;
			if (N1 > N2) {
				B = N1;
				C = N2;
			} else {
				B = N2;
				C = N1;

			}
		}

		
		if(A >= B + C) {
			//não forma triangulo, calcular área do trapezio
			// area = (B + b) * h /2
			double area =  ((A + B) * C) /2;
			System.out.printf("Area = %.1f%n", area);
		}
		
		else {
			double perimetro =  A + B + C;
			System.out.printf("Perimetro = %.1f%n", perimetro);
		}
		
		
		sc.close();
	}

}
