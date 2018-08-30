package br.ufpi.poo1.aux;

public class Lampada {
	boolean ligada;

	public void liga() {
		ligada = true;
	}

	public void desliga() {
		ligada = false;
	}

	public void observa() {
		if (ligada)
			System.out.println("ligada!");
		else
			System.out.println("desligada!");
	}
}
