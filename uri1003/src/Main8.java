import java.util.Locale;
import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X;
		double Y, Z;
		
		X = sc.nextInt();
		Y = sc.nextDouble();
		
		Z = X/Y;
	
		System.out.printf("%.3f km/l%n", Z);
		
		sc.close();
	}

}
