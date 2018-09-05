package br.ufpi.poo1.listas;

import br.ufpi.poo1.aux.Pessoa;

public class Lista3 {

	public static void main(String[] args){
		questao1();
	}

	private static void questao1() {
		Pessoa p  = new Pessoa();
		
		p.setNome("Alcemir");
		p.setIdade(10);
		p.setAltura(100.0);
		p.setPeso(76.5);
		
		System.out.println("Nome: "+ p.getNome());
		System.out.println("Idade: "+ p.getIdade());
		System.out.println("Altura: " + p.getAltura()+"cm");
		System.out.println("Massa Corporal: "+ p.getPeso()+"Kg");

		System.out.println(p.getIMC());
		
		p.imprime();
	}
}
