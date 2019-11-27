import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] nome = new String[n];

		for (int i = 0; i < n; i++) {
			nome[i] = sc.next();
		}

		System.out.println("Nomes lidos:");
		for (String oqVcQuiser :  nome) {
			System.out.println(oqVcQuiser);
		}

		sc.close();
	}

}
