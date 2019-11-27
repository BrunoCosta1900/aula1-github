import java.util.Scanner;

public class estudos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hora;
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if ((hora >= 6) && (hora < 12)) {
			System.out.println("Bom dia");
		}
		else if ((hora >= 12) && (hora < 18)) {
			System.out.println("Boa tarde");
		}
		else if (hora <= 5){
			System.out.println("Boa madrugada");
		}
		else {
			System.out.println("Boa noite");
		}
		
		sc.close();
	}	 
}

