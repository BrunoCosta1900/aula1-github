import java.util.Locale;
import java.util.Scanner;

public class Main1021 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double N;
		int quociente, resto, nota, moeda;
		
		N = sc.nextDouble();
		
		resto = (int)(N * 100 + 0.5);
		
		System.out.println("NOTAS:");
		
		nota = 100;
		quociente = resto / (nota*100);
		System.out.println(quociente+ " nota(s) de R$ "+ nota + ".00");
		resto = resto % (nota*100);
		
		nota = 50;
		quociente = resto / (nota*100);
		System.out.println(quociente+ " nota(s) de R$ "+ nota + ".00");
		resto = resto % (nota*100);
		
		nota = 20;
		quociente = resto / (nota*100);
		System.out.println(quociente+ " nota(s) de R$ "+ nota + ".00");
		resto = resto % (nota*100);
		
		nota = 10;
		quociente = resto / (nota*100);
		System.out.println(quociente+ " nota(s) de R$ "+ nota + ".00");
		resto = resto % (nota*100);
		
		nota = 5;
		quociente = resto / (nota*100);
		System.out.println(quociente+ " nota(s) de R$ "+ nota + ".00");
		resto = resto % (nota*100);
		
		nota = 2;
		quociente = resto / (nota*100);
		System.out.println(quociente+ " nota(s) de R$ "+ nota + ".00");
		resto = resto % (nota*100);
		
		System.out.println("MOEDAS:");
		
		moeda = 100;
		quociente = resto / moeda;
		System.out.println(quociente+ " moeda(s) de R$ 1.00");
		resto = resto % moeda;
		
		moeda = 50;
		quociente = resto / moeda;
		System.out.println(quociente+ " moeda(s) de R$ 0.50");
		resto = resto % moeda;
		
		moeda = 25;
		quociente = resto / moeda;
		System.out.println(quociente+ " moeda(s) de R$ 0.25");
		resto = resto % moeda;
		
		moeda = 10;
		quociente = resto / moeda;
		System.out.println(quociente+ " moeda(s) de R$ 0.10");
		resto = resto % moeda;
		
		moeda = 5;
		quociente = resto / moeda;
		System.out.println(quociente+ " moeda(s) de R$ 0.05");
		resto = resto % moeda;
		
		
		System.out.println(quociente+ " moeda(s) de R$ 0.01");
		
		sc.close();
	}

}
		//OU
		/*double N, resto, moeda, quociente;
		int nota;
		
		N = sc.nextDouble();
		resto = N;
		
		System.out.println("NOTAS:");
		
		nota = 100;
		quociente = (int) resto / nota;
		System.out.println((int)quociente + " nota(s) de R$ "+ nota+".00");
		resto = resto % nota;
		
		nota = 50;
		quociente = (int) resto / nota;
		System.out.println((int)quociente + " nota(s) de R$ "+ nota+".00");
		resto = resto % nota;
		
		nota = 20;
		quociente = (int) resto / nota;
		System.out.println((int)quociente + " nota(s) de R$ "+ nota+".00");
		resto = resto % nota;
		
		nota = 10;
		quociente = (int) resto / nota;
		System.out.println((int)quociente + " nota(s) de R$ "+ nota+".00");
		resto = resto % nota;
		
		nota = 5;
		quociente = (int) resto / nota;
		System.out.println((int)quociente + " nota(s) de R$ "+ nota+".00");
		resto = resto % nota;
		
		nota = 2;
		quociente = (int) resto / nota;
		System.out.println((int)quociente + " nota(s) de R$ "+ nota+".00");
		resto = resto % nota;
		
		System.out.println("MOEDAS:");
		
		moeda = 1;
		quociente = resto / moeda;
		System.out.printf("%d moeda(s) de R$ %.2f%n", (int)quociente, moeda);
		resto = resto % moeda;
		
		moeda = 0.50;
		quociente = resto / moeda;
		System.out.printf("%d moeda(s) de R$ %.2f%n", (int)quociente, moeda);
		resto = resto % moeda;
		
		moeda = 0.25;
		quociente = resto / moeda;
		System.out.printf("%d moeda(s) de R$ %.2f%n", (int)quociente, moeda);
		resto = resto % moeda;
		
		moeda = 0.10;
		quociente = resto / moeda;
		System.out.printf("%d moeda(s) de R$ %.2f%n", (int)quociente, moeda);
		resto = resto % moeda;
		
		moeda = 0.05;
		quociente = resto / moeda;
		System.out.printf("%d moeda(s) de R$ %.2f%n", (int)quociente, moeda);
		resto = resto % moeda;
		
		moeda = 0.01;
		quociente = resto / moeda;
		System.out.printf("%d moeda(s) de R$ %.2f%n", (int)quociente, moeda);
		resto = resto % moeda;
		sc.close();
			
			}
		}
		*/

