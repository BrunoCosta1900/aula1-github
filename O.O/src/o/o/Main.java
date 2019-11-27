package o.o;

public class Main{
	
	private String nome = "KRISTALO!";
	private int[] numeros;
	public static final int VIDA_MAXIMA = 100;
	
	//Método construtor.
	public Main() {
		numeros = new int [100];
	}
 
	public String getNome() {
		return nome;
	}
	public static void main(String [] args) {
		Main m = new Main();
		System.out.println(Main.VIDA_MAXIMA);	
	}
	}
	
	
	

