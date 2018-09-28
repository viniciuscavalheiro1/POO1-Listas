package br.ufpi.poo1.saladeaula.d20180926;

class ContaPoupanca extends Conta {

	private double taxaDeRendimento;

	public ContaPoupanca(double umaTaxaDeRendimento) {
		super(0);
		this.taxaDeRendimento = umaTaxaDeRendimento;
	}

	public void adicionarRendimentos() {
		double novoSaldo = getSaldoAtual() + getSaldoAtual()
				* this.taxaDeRendimento/100;
		setSaldoAtual(novoSaldo);
	}

}