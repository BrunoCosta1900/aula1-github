import java.util.Scanner;

public class testando1050 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String dia;

		switch (N) {
		case 61:
			dia = "Brasilia";
			break;
		case 71:
			dia = "Salvador";
			break;
		case 11:
			dia = "SP";
			break;
		case 21:
			dia = "RJ";
			break;
		case 32:
			dia = "J Fora";
			break;
		case 19:
			dia = "Campinas";
			break;
		case 27:
			dia = "Vitoria";
			break;
		case 31:
			dia = "BH";
		default:
			dia = "NAO CDASTRDO";
			break;
		}

		System.out.println("Dia da semana: "+ dia);
		sc.close();
	}




	}


