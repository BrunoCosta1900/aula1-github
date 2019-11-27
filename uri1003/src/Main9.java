import java.util.Locale;
import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, tempo;
		
		n = sc.nextInt();
		
		tempo = 2*n;
		
		System.out.println(tempo+ " minutos");
		
		sc.close();
	}

}
