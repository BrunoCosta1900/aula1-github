import java.util.Scanner;

public class Main1042 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int A, B, C;
		if (n1 > n2 && n1 > n3) {
			// n1 é maior
			C = n1;
			if(n2 > n3) {
				B = n2;
				A = n3;
			}
			else {
				B = n3;
				A = n2;
			}
		}
		
		else if (n2 > n3) {
			// n2 é maior
			C = n2;
			if(n1 > n3) {
				B = n1;
				A = n3;
			}
			else {
				B = n3;
				A = n1;
			}
		}

		else {
			//n3 é maior
			C = n3;
			if (n2 > n1) {
				B = n2;
				A = n1;
			}
			else {
				B = n1;
				A = n2;
			}
		}
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println();
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		sc.close();
	}

}
