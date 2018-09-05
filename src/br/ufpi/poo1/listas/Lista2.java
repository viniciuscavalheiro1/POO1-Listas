package br.ufpi.poo1.listas;

import br.ufpi.poo1.aux.Lampada;
import br.ufpi.poo1.aux.Quadrado;

public class Lista2 {

	public static void main(String[] args){
		// questao1e2();
		questao3e4();
	}
	
	static void questao1e2(){
		Lampada l = new Lampada();
		l.liga();
		l.observa();
		l.desliga();
		l.observa();
	}
	
	static void questao3e4(){
		Quadrado q1 = new Quadrado(2);
		Quadrado q2 = new Quadrado(4);
		Quadrado q3 = new Quadrado(5);
		
		q1.area();
		q1.perimetro();
		
		q2.area();
		q2.perimetro();
		
		q3.area();
		q3.perimetro();
		
	}
	
	
}
