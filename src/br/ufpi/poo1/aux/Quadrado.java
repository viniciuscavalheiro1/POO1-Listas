package br.ufpi.poo1.aux;

public class Quadrado {

	double lado;
	
	public Quadrado(double umLado) {
		this.lado = umLado;
	}
	public void area(){
		System.out.println("Area: "+(lado*lado));
	}
	public void perimetro(){
		System.out.println("Perimetro: "+ (4*lado));
	}
}
