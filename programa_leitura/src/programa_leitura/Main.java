package programa_leitura;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		/*
		 * Scanner in = new Scanner(System.in);
		 
		String nome, idade, peso, cidade, Estado, pa�s;
		System.out.println("Por favor, digite o teu nome: ");
		nome = in.nextLine();
		System.out.println("Por favor, digite a tua idade: ");
		idade = in.nextLine();
		System.out.println("Por favor, digite o teu peso: ");
		peso = in.nextLine();
		System.out.println("Por favor, digite a tua cidade: ");
		cidade = in.nextLine();
		if(cidade.equals("Feira de Santana")); {
			System.out.println("Legal!! Sou de Feira tamb�m");
		}else {
			System.out.println("Pertinho!!");	
		}
		System.out.println("Por favor, digite o teu Estado: ");
		Estado = in.nextLine();
		System.out.println("Por favor, digite o teu pa�s: ");
		pa�s = in.nextLine();
		//Gerar resultado final:
		System.out.println("---------------");
		System.out.println("Aqui est� o resultado do teste: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + Estado);
		System.out.println("Pa�s: " + pa�s);
	*/
		
		 
		Scanner in = new Scanner(System.in);
		String nome, comando;
		Random rand = new Random();
		System.out.println("Seja bem vindo ao jogo! Insira seu nome: ");
		nome = in.nextLine();
		System.out.println("Seja muito bem vindo(a) "+nome);
		System.out.println("Voc� deseja avan�ar para qual dire��o? (w,s,a,d)");
		comando = in.nextLine();
		if(comando.equals("w")) {
			System.out.println("Voc� est� indo para frente!");
			System.out.println("Um mosntro surgiu, o que deseja fazer? (a=capturar,c=fugir)");
			comando = in.nextLine();
			if(comando.equals("a")) {
				if(rand.nextInt(100) < 75) {
					System.out.println("Parab�ns!! Voc� capturou o mosntro!");
				}
				
			}else {	
				System.out.println("Voc� fugiu do monstro!");
			}
		}else if(comando.equals("s")) {
			System.out.println("Voc� est� entrando em outro mapa...");
			//*/
		}
		
		
		}
		
	}
	

