package br.ufpi.poo1.aux;

public class Pessoa {

	private int numero;
	private String nome;
	private double saldo;

	public Pessoa(int id, String cliente, double saldoInicial) {
		setNumero(id);
		setNome(cliente);
		setSaldo(saldoInicial);
	}

	public Pessoa() {
		this(0, null, 0.0);
	}

	public void setSaldo(double saldoInicial) {
		this.saldo = saldoInicial;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setNome(String cliente) {
		this.nome = cliente;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNumero(int id) {
		this.numero = id;
	}
	
	public int getNumero() {
		return this.numero;
	}

	public double getIMC(double massa, double altura) {
		return massa/(altura * altura);
	}

	public void imprime() {
		System.out.println("Numero: "+ getNumero());
		System.out.println("Nome: "+ getNome());
		System.out.println("Saldo: +"+ getSaldo());
	}

}
