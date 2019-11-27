import java.util.Scanner;

public class maiorNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int o = sc.nextInt();
		
		int maior = 0;
		if (n > maior) {
			maior = n;
		}
		 if (m > maior){
			maior = m;
		}
		if (o > maior) {
			maior = o;
		}
		
		System.out.println("Maior = " +maior);
		
		sc.close();
	}

}
