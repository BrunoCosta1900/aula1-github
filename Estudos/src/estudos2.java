import java.util.Scanner;

public class estudos2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		int soma = 0;
		while(X != 0) {
			soma += X;
			X = sc.nextInt();
		}
		
		sc.close();
	}

}
