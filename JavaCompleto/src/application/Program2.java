package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome do produto: ");
		String name = sc.next();
		System.out.println("Pre�o do produto: ");
		double price = sc.nextDouble();
		System.out.println("Quantidade: ");
		int quantity = sc.nextInt();
		Products products = new Products(name,price, quantity);

		products.setName("Computer");
		System.out.println("Update name: "+ products.getName());	
		
		products.setPrice(1200);
		System.out.println("Update price: "+ products.getPrice());
		
		products.getQuantity();
		
		System.out.println();
		System.out.println(products);

		System.out.println("Adicionar produtos: ");
		quantity = sc.nextInt();
		products.addProducts(quantity);

		System.out.println();
		System.out.println("Produtos atualizados: " + products);

		System.out.println();
		System.out.println("Remover produtos: ");
		quantity = sc.nextInt();
		products.removeProducts(quantity);
		
		

		System.out.println();
		System.out.println("Produtos atualizados: " + products);

		sc.close();
	}

}
