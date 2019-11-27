import java.util.Scanner;

public class Main1061 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int dia1, hora1, minuto1, segundo1, dia2, hora2, minuto2, segundo2, 
		dia, hora, minuto, segundo, inicio, fim, duracao, resto;
		String s;
		
		s = sc.next();
		dia1 = sc.nextInt();
		hora1 = sc.nextInt();
		s = sc.next();
		minuto1 = sc.nextInt();
		s = sc.next();
		segundo1 = sc.nextInt();
		s = sc.next();
		dia2 = sc.nextInt();
		hora2 = sc.nextInt();
		s = sc.next();
		minuto2 = sc.nextInt();
		s = sc.next();
		segundo2 = sc.nextInt();
		
		
		
		inicio = (dia1 -1)*24*60*60 + hora1*60*60 + minuto1 *60 + segundo1;
		fim = (dia2 - 1)*24*60*60 + hora2*60*60 + minuto2 *60 + segundo1;
		duracao = fim - inicio;
		
		dia = duracao / (24*60*60);
		resto = duracao % (24*60*60);
		hora = resto / (60*60);
		resto = resto % (60*60);
		minuto = resto / 60;
		segundo = resto % 60;
	
		System.out.println(dia + " dia(s)");
		System.out.println(hora + " hora(s)");
		System.out.println(minuto + " minuto(s)");
		System.out.println(segundo + " segundo(s)");	
		
		sc.close();
	}

}
