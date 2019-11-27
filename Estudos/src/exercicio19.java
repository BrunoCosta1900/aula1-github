import java.util.Locale;
import java.util.Scanner;

public class exercicio19 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] nome = new String[n];
		double[] compra = new double[n];
		double[] venda = new double[n];

		for (int i = 0; i < n; i++) {
			nome[i] = sc.next();
			compra[i] = sc.nextDouble();
			venda[i] = sc.nextDouble();
		}

		int conta1 = 0;
		int conta2 = 0;
		int conta3 = 0;

		for (int i = 0; i < n; i++) {

			double lucro = venda[i] - compra[i];

			double porcentagemDeLucro = lucro / compra[i] * 100.0;

			if (porcentagemDeLucro < 10.0) {
				conta1++;

			}

			else if (porcentagemDeLucro >= 10.0 && porcentagemDeLucro <= 20.0) {
				conta2++;
			}

			else {
				conta3++;
			}

		}
		System.out.println("Lucro abaixo de 10%: " + conta1);
		System.out.println("Lucro entre 10% e 20%: " + conta2);
		System.out.println("Lucro acima de 20%: " + conta3);

		double valorDeCompra = 0.0;
		double valorDeVenda = 0.0;

		for (int i = 0; i < n; i++) {
			valorDeCompra += compra[i];
			valorDeVenda += venda[i];
		}

		double LucroTotal = valorDeVenda - valorDeCompra;

		System.out.printf("Valor total de compra: %.2f%n", valorDeCompra);
		System.out.printf("Valor total de venda: %.2f%n", valorDeVenda);
		System.out.printf("Lucro total: %.2f%n", LucroTotal);

		sc.close();

	}

}
