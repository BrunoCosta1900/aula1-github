import java.util.Locale;
import java.util.Scanner;

public class Main17 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempo, velMedia;
		double X;
		
		tempo = sc.nextInt();
		velMedia = sc.nextInt();
			
		X = (double)(tempo*velMedia)/12;
		
		System.out.printf("%.3f%n", X);
		sc.close();
	}

}
