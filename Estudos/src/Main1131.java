import java.util.Scanner;

public class Main1131 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vitInter = 0;
		int vitGremio = 0;
		int empate = 0;
		int novoGrenal = 1;

		while (novoGrenal == 1) {
			int golsInter = sc.nextInt();
			int golsGremio = sc.nextInt();

			if (golsInter > golsGremio) {
				vitInter += 1;
			} else if (golsGremio > golsInter) {
				vitGremio += 1;
			} else {
				empate += 1;
			}
			System.out.println("Novo grenal (1-sim 2-nao)");
			novoGrenal = sc.nextInt();
		}

		int total = vitInter + vitGremio + empate;

		System.out.println(total + " grenais");
		System.out.println("Inter:" + vitInter);
		System.out.println("Gremio:" + vitGremio);
		System.out.println("Empates:" + empate);

		if (vitInter > vitGremio) {
			System.out.println("Inter venceu mais");
		} else if (vitInter < vitGremio) {
			System.out.println("Gremio venceu mais");
		} else {
			System.out.println("Nao houve vencedor");
		}
		sc.close();
	}

}
