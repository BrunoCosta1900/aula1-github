import java.util.Scanner;

public class Main1049 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String nome1 = sc.next();
		String nome2 = sc.next();
		String nome3 = sc.next();
		
		
		if(nome1.equals("vertebrado")) {
			if(nome2.equals("ave")) {
				if(nome3.equals("carnivoro")) {
					System.out.println("aguia");
				}
				else {
					System.out.println("pomba");
				}
			}
			else if (nome2.equals("mamifero")) {
				if(nome3.equals("onivoro")) {
					System.out.println("homem");
				}
				else {
					System.out.println("vaca");
				}
			}
		}
		
		
		else if(nome1.equals("invertebrado")) {
			if(nome2.equals("inseto")) {
				if(nome3.equals("hematofago")) {
					System.out.println("pulga");
				}
				else System.out.println("lagarta");
			}
			else if(nome2.equals("anelideo")) {
				if(nome3.equals("hematofago")) {
					System.out.println("sanguessuga");
				}
				else {
					System.out.println("minhoca");
				}
			}
		}
		
		sc.close();
	}

}
