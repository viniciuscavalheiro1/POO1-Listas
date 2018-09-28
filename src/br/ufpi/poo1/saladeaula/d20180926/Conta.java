package br.ufpi.poo1.saladeaula.d20180926;

public class Conta {

	private double saldoAtual;

	public Conta(double saldoInicial) {
		setSaldoAtual(saldoInicial);
	}

	public void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
	}

	public void sacar(double valor) {
		this.saldoAtual -= valor;
	}

	public void depositar(double valor) {
		this.saldoAtual += valor;
	}

	public void setSaldoAtual(double novoSaldo) {
		this.saldoAtual = novoSaldo;
	}

	public double getSaldoAtual() {
		return this.saldoAtual;
	}
}
