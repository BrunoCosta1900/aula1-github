import java.util.Locale;
import java.util.Scanner;

public class Main1011 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R = sc.nextDouble();
		double pi = 3.14159;
				
		double vol = (double)(4/3.0)*pi*(Math.pow(R, 3.0)); 
		System.out.printf("VOLUME = %.3f%n", vol);
		
		
		sc.close();
	}

}
