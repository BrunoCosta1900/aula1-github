package entities;

public class Banco {

	private int conta;
	private String nome;
	private double valorEmConta;

	public Banco() {
	}

	public Banco(int conta, String nome, double valorInicialEmConta) {

		this.conta = conta;
		this.nome = nome;
		addMoney(valorInicialEmConta);
	}

	public Banco(int conta, String nome) {

		this.conta = conta;
		this.nome = nome;

	}

	public int getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorEmConta() {
		return valorEmConta;
	}

	public void addMoney(double addMoney) {
		this.valorEmConta += addMoney;
	}

	public void removeMoney(double removeMoney) {
		this.valorEmConta -= removeMoney + 5.0;
	}

	public String toString() {
		return "Account " + conta + ", Holder: " + nome + ", Balance: $ " + String.format("%.2f", valorEmConta);
	}

}