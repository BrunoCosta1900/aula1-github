import java.util.Locale;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x,y,z;
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		z = (x*3.5 + y*7.5)/11.0;
		
		System.out.printf("MEDIA = %.5f%n", z);
		
		sc.close();
	}

}
