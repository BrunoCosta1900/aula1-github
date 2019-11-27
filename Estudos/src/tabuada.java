import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		
		for (int i = 1; i <= 10; i++) {
			int tab = n * i;
			System.out.println(i +" x " +n+ " = " + tab);
		}
		
		
		sc.close();
	}

}
