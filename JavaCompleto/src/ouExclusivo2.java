import java.util.Scanner;

public class ouExclusivo2 {
	//Operadores bitwise

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int mask = 0b100000;

		int n = sc.nextInt();

		
			if ((mask & n) != 0) {
				System.out.println("6 bit is true");
			} else {
				System.out.println("6 bit is false");
			}
			

		sc.close();
	}

}
