import java.util.Locale;
import java.util.Scanner;

public class Main1079 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double a = 2.0;
		double b = 3.0;
		double c = 5.0;

		for (int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			
			double media = (x*a + y*b + z*c) / (10.0);
			
			System.out.printf("%.1f%n", media);
		}
		
		

		sc.close();
	}

}
