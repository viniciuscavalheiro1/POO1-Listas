package br.ufpi.poo1.saladeaula.d20180926;

public class Main {

	public static void main(String[] args) {
		ContaPoupanca cp = new ContaPoupanca(0.5);
		ContaCorrente cc = new ContaCorrente(100.0);

		cp.depositar(10000.0);
		cp.transferir(cc, 2000.0);
		cc.sacar(1500.0);
		cc.sacar(80.0);
		cp.transferir(cc, 1000.0);
		cc.sacar(400.0);

		// Simular fim de mês
		cp.adicionarRendimentos();
		cc.deduzirTaxas();
		
		System.out.println("O saldo de CP é: "+cp.getSaldoAtual());
		System.out.println("O saldo de CC é: "+cc.getSaldoAtual());
	}


	
}
