import java.util.Scanner;

public class Main1050 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String DDD;
		
		
		switch (n) {
		case 61:
			DDD = "Brasilia"; 
		break;
		
		case 71:
			DDD = "Salvador";
			break;
		
		case 11:
			DDD = "Sao Paulo";
			break;
			
		case 21:
			DDD = "Rio de Janeiro";
			break;
			
		case 32:
			DDD = "Juiz de Fora";
			break;
			
		case 19:
			DDD = "Campinas";
			break;
			
		case 27:
			DDD = "Vitoria";
			break;
			
		case 31:
			DDD = "Belo Horizonte";
			break;
			
			default:
			DDD = "DDD nao cadastrado";
		}
		
		
		System.out.println(DDD);
		
		sc.close();
	}

}
