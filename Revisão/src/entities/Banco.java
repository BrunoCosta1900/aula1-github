package entities;

public class Banco {

	private int conta;
	private String nome;
	private double valorEmConta;

	public Banco(int conta, String nome) {

		this.conta = conta;
		this.nome = nome;
	}

	public Banco(int conta, String nome, double depositoInicial) {

		this.conta = conta;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public double getValorEmConta() {
		return valorEmConta;
	}

	public void deposito(double deposito) {
		this.valorEmConta = valorEmConta + deposito;
	}

	public void saque(double saque) {
		this.valorEmConta = valorEmConta - (saque + 5.0);
	}

	public String toString() {
		return "Conta n�mero: " + conta + ", Propri�tario: " + nome + ", Valor: R$ " 
				+ String.format("%.2f", valorEmConta) ;
	}
}
