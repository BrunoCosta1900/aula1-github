import java.util.Locale;
import java.util.Scanner;

public class Exerc {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 String X, Y;
		 
		
		int Z,W; 
		double media;
		
		X = sc.next();
		Z = sc.nextInt();
		
		sc.nextLine();
		
		Y = sc.next();
		W = sc.nextInt();
		sc.nextLine();
		
		media = (double) (Z + W) /2;
		
		System.out.println("A idade média de " +X+ " e " +Y+" é de "+ media);
		
		sc.close();
		
		*/
		
		String nome1 = sc.next();
		int idade1 = sc.nextInt();
		String nome2 = sc.next();
		int idade2 = sc.nextInt();
	
		//double med = (double)(idade1 + idade2)/2;
		double med = (idade1 + idade2) / 2.0;
		
		System.out.printf("A idade média de %s e %s é de %.1f anos.", nome1, nome2, med);
		
		sc.close();
	}

}
