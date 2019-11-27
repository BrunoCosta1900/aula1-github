import java.util.Scanner;

public class Main1047 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int minutoInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int minutoFinal = sc.nextInt();

		
		int instanteInicial = horaInicial*60 + minutoInicial;
		int instanteFinal = horaFinal*60 + minutoFinal;
		
		int duracao;
		if ( instanteInicial < instanteFinal) {
			duracao =  instanteFinal - instanteInicial;

		} 
		else {
			duracao = 1440 + instanteFinal - instanteInicial;
		}
		
		
		int duracaoHora = duracao / 60;
		int duracaoMinuto = duracao % 60;

		System.out.println("O JOGO DUROU " + duracaoHora + " HORA(S) E " + duracaoMinuto + " MINUTO(S)");

		sc.close();
	}

}
