package br.ufpi.poo1.saladeaula.d20180926;

public class ContaCorrente extends Conta {
	private int qtdeDeOperacoes;
	private final double taxaPorOperacoes = 2.0;

	public ContaCorrente(double saldoInicial) {
		super(saldoInicial);
		this.qtdeDeOperacoes = 0;
	}

	public void deduzirTaxas() {
		double custoDeOperacoes = taxaPorOperacoes * (qtdeDeOperacoes - 3);
		setSaldoAtual(getSaldoAtual() - custoDeOperacoes);
	}

	@Override
	public void transferir(Conta destino, double valor) {
		super.transferir(destino, valor);
		qtdeDeOperacoes++;
	}

	@Override
	public void sacar(double valor) {
		super.sacar(valor);
		qtdeDeOperacoes++;
	}

	@Override
	public void depositar(double valor) {
		super.depositar(valor);
		qtdeDeOperacoes++;
	}
}