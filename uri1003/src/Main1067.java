import java.util.Locale;
import java.util.Scanner;

public class Main1067 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x % 2 == 0) {
			x = x - 1;
		}
		
		for (int i = 1; i <= x; i+=2) {
			
			
			System.out.println(i);
		}
		
		
		sc.close();
	}

}
