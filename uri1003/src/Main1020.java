import java.util.Scanner;

public class Main1020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, quociente, periodo;
		
		N = sc.nextInt();
		periodo = N;
		
		quociente = periodo / 365;
		System.out.println(" ano(s)");
		periodo = periodo % 365;
		
		quociente = periodo / 30;
		System.out.println(quociente+" mes(es)");
		periodo = periodo % 30;
		
		System.out.println(quociente + " dia(s)");
				
		
		sc.close();
		
		//OU
		
		/*import java.util.Scanner;

public class Main1020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, anos, meses, dias, resto;
		
		N = sc.nextInt();
				
		anos = N / 365;
		resto = N % 365;
		meses = resto / 30;
		dias = resto % 30;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		sc.close();
	}

}
*/
	}

}
