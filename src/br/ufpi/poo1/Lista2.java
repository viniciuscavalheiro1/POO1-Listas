package br.ufpi.poo1;

import br.ufpi.poo1.aux.Lampada;

public class Lista2 {

	public static void main(String[] args){
		questao1e2();
	}
	
	static void questao1e2(){
		Lampada l = new Lampada();
		l.liga();
		l.observa();
		l.desliga();
		l.observa();
	}
	
	
}
