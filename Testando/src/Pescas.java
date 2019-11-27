import java.util.Locale;
import java.util.Scanner;

public class Pescas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in); double x, y, media;
		 * 
		 * System.out.print("Digite o primeiro número: "); x = sc.nextDouble();
		 * System.out.print("Digite o segundo núemro: "); y = sc.nextDouble(); media =
		 * (x+y) / 2.0; System.out.println("Media = " + media); sc.close();
		 */

		/*
		 * int y1 = 32;
		 * 
		 * System.out.println(y1);
		 */

		// double x = 10.35784;
		/*
		 * System.out.println(x);
		 * 
		 * Locale.setDefault(Locale.US);
		 * 
		 * System.out.printf("%.2f%n", x); System.out.printf("%.4f%n", x);
		 * System.out.printf("%.1f%n", x); System.out.printf("%.0f%n", x);
		 * System.out.printf("%.20f%n", x);
		 */

		/*
		 * String nome = "Bruno"; int idade = 29; double renda = 4000.0;
		 * System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, renda);
		 */

		/*
		 * String product1 = "Computer"; String product2 = "Office desk";
		 * 
		 * int age = 30; int code = 5290; char gender = 'F';
		 * 
		 * double price1 = 2100.0; double price2 = 650.50; double measure = 53.234567;
		 * 
		 * System.out.println("Products: ");
		 * System.out.printf("%s, which price is $ %.2f %n", product1, price1);
		 * System.out.printf("%s, which price is $ %.2f %n", product2, price2);
		 * System.out.println();
		 * System.out.printf("Record: %d years old, code %d and gender: %s %n", age,
		 * code, gender); System.out.println();
		 * System.out.printf("Measue with eight decimal places: %.8f %n", measure);
		 * System.out.printf("Rouded (three decimal places: %.3f %n", measure);
		 * Locale.setDefault(Locale.US); System.out.printf("US decimal point: %.3f",
		 * measure);
		 */

		// CALCULOS
		/*
		 * float b, B, h, area;
		 * 
		 * b = 6f; B = 8f; h = 5f; area = (b + B) / 2f * h; System.out.println(area);
		 */

		/*
		 * int a, b; double resultado;
		 * 
		 * a = 5; b = 2;
		 * 
		 * resultado = (double) a / b; System.out.println(resultado);
		 */
		/*
		 * int a, b; double resultado; a = 5; b = 2;
		 * 
		 * resultado = a / b; System.out.println(resultado);
		 */

		/*
		 * double a; int b;
		 * 
		 * a = 5.0; b = (int) a; System.out.println(b);
		 */

		/*
		 * String x; Scanner sc = new Scanner(System.in);
		 * 
		 * x = sc.next("Maria");
		 */
		/*
		 * int x; Scanner sc = new Scanner(System.in); x = sc.nextInt("10");
		 */
		/*
		 * double x; x = sc.nextDouble();
		 */
		/*
		 * char x; x = sc.next().charAt(0);
		 */
		/*
		 * String x; int y; double z;
		 * 
		 * x = sc.next(); y = sc.nextInt(); z = sc.nextDouble();
		 * 
		 * sc.close();
		 */

		// Para ler um texto ATÉ A QUEBRA DE LINHA
		/*
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * String s1, s2, s3;
		 * 
		 * s1 = sc.nextLine(); s2 = sc.nextLine(); s3 = sc.nextLine();
		 * 
		 * System.out.println("DADOS DIGITADOS: "); System.out.println(s1);
		 * System.out.println(s2); System.out.println(s2);
		 * 
		 * sc.close();
		 */

		// QUEBRA DE LINHA PENDENTE

		/*
		 * int x;
		 * 
		 * String s1, s2, s3;
		 * 
		 * x = sc.nextInt(); s1 = sc.nextLine(); s2 = sc.nextLine(); s3 = sc.nextLine();
		 * 
		 * System.out.println("DADOS DIGITADOS: "); System.out.println(x);
		 * System.out.println(s1); System.out.println(s2); System.out.println(s3);
		 */

		/*
		 * Resumo da aula • Scanner • next() • nextInt() • nextDouble() •
		 * next().charAt(0) Locale Como ler até a quebra de linha • nextLine() • como
		 * limpar o buffer de leitura
		 */
		/*
		 * double x = 3.0; double y = 4.0; double z = -5.0; double A, B, C;
		 * 
		 * A = Math.sqrt(x); B = Math.sqrt(y); C = Math.sqrt(25.0);
		 * System.out.println("Raiz quadrada de " + x + " = " + A);
		 * System.out.println("Raiz quadrada de " + y + " = " + B);
		 * System.out.println("Raiz quadrada de 25 = " + C); System.out.println();
		 * 
		 * A = Math.pow(x, y); B = Math.pow(x , 2.0); C = Math.pow(5.0, 2.0);
		 * System.out.println(x + " elevado a " + y + " = " +A); System.out.println(x +
		 * " elevado a " + 2.0 +" = " + B); System.out.println(5.0 + " elevado a " + 2.0
		 * + " = "+ C); System.out.println();
		 * 
		 * A = Math.abs(y); B = Math.abs(z); System.out.println("Valor absoluto de "+ y
		 * + " = " + A); System.out.println("Valor absoluto de "+z+ " = "+B);
		 */

		/*
		 * double x = 300.0; double y = 4500.0; double z = 80000.0;
		 * 
		 * double A, B, C;
		 * 
		 * A = Math.sqrt(x); B = Math.sqrt(y); C = Math.sqrt(z);
		 * 
		 * System.out.println("Raiz de " + x + " = " + A); System.out.println("Raiz de "
		 * + y + " = " + B); System.out.println("Raiz de " + z + " = " + C);
		 */

		/*
		 * double x = 10.0; //largura double y = 30.0; //comprimento double z = 200.00;
		 * //Preço metro quadrado double A = 300.00; //Área double P = 60000.00; //Preço
		 * 
		 * 
		 * A = (x * y); P = (A * z);
		 * 
		 * System.out.println("A largura do terreno é " + x + " e o comprimento é " +
		 * y); System.out.println("O valor do seu metro quadrado é " +z);
		 * System.out.println("O valor da área do terreno é " +A+
		 * " e o valor do preço do terreno é "+P); System.out.println();
		 */
		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
		 * 
		 * 
		 * 
		 * double largura = sc.nextDouble(); double comprimento = sc.nextDouble();
		 * double metroQuadrado = sc.nextDouble();
		 * 
		 * double area = largura * comprimento; double preco = area* metroQuadrado;
		 * 
		 * largura = 10; comprimento = 20; metroQuadrado = 200; //area = 300; //preco =
		 * 60000;
		 * 
		 * System.out.printf("AREA = %.2f %n", area);
		 * System.out.printf("PRECO = %.2 %n", preco);
		 * 
		 * sc.close();
		 */
		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
		 * 
		 * double x; x = sc.nextDouble(); System.out.printf("Vc digitou: %.2f%n", x);
		 * 
		 * sc.close();
		 */
		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
		 * 
		 * char x; x = sc.next().charAt(0); System.out.println("Vc digiou: "+ x);
		 * 
		 * sc.close();
		 */
		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
		 * 
		 * String x; int y; double z;
		 * 
		 * x = sc.next(); y = sc.nextInt(); z = sc.nextDouble();
		 * System.out.println("Digitados: "); System.out.println(x);
		 * System.out.println(y); System.out.println(z);
		 * 
		 * sc.close();
		 */
		/*
		Scanner sc = new Scanner(System.in);

		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		*/
		/*
		double delta, a, b, c, x, x1, x2 ;
		
		a = -2;
		b = 12;
		c = -5;
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		System.out.println(delta);
		x1 = (-b + Math.sqrt(delta)) / (2.0*a);
		System.out.println(x1);
		x2 = (-b - Math.sqrt(delta)) / (2.0*a);
		System.out.println(x2);
		*/
	/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
						
		double comprimento = sc.nextDouble();
		double largura = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f %n", area);
		System.out.printf("PREÇO = %.3f %n", preco);
		
		sc.close();
*/		
		
	//	public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			double R, A, pi = 3.14159;
		    
		    R = sc.nextDouble();

		    A = pi * R * R;

		    System.out.printf("A=%.4f%n", A);

			sc.close();
		}
	}

