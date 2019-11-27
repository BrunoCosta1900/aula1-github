import java.util.Scanner;

public class Main1153 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int fator = 1;
		for (int i = n; i >= 1; i--) {
			fator = fator * i;
		}

		System.out.println(fator);

		sc.close();
	}

}
