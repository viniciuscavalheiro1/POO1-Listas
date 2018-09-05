package br.ufpi.poo1.listas;

import br.ufpi.poo1.aux.Pessoa;

public class Lista3 {

	public static void main(String[] args){
		questao1();
	}

	private static void questao1() {
		Pessoa p  = new Pessoa();
		
		p.setNome("Alcemir");
		p.setNumero(1);
		p.setSaldo(100.0);
		
		System.out.println("Numero: "+p.getNumero());
		System.out.println("Nome: "+p.getNome());
		System.out.println("Saldo: +"+p.getSaldo());
		
		System.out.println(p.getIMC(75.5, 163));
		
		p.imprime();
	}
}
