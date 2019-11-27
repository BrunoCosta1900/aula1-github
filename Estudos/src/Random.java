import java.util.Locale;
import java.util.Scanner;

public class Random {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int limiteInferior = 1;
		int limiteSuperior = 6;
		int alcance = limiteSuperior - limiteInferior;
		double nrRandomico = Math.random();
		System.out.println("O número randômico escolhido entre 1 e 6 foi "+ 
		Math.round(limiteInferior + nrRandomico * alcance));

		sc.close();
	}

}
