package br.ufpi.poo1.aux;

public class Estoque{
	public String nome;
	public int qtdAtual;
	public int qtdMinima;

	public Estoque(){

	}

	public Estoque(String nome, int qtdAtual, int qtdMinima){

	}

	public void mudarNome(String nome){
		this.nome = nome;
	}
	public void mudarQtdMinima(int qtdMinima){
		this.qtdMinima = qtdMinima;
	}

	public void repor(int qtd){
		this.qtdAtual += qtd;
	}

	public void darBaixa(int qtd){
		this.qtdAtual -= qtd;
	}

	public String mostra(){
		return("nome: " + this.nome + " | quantidade minima: " + this.qtdMinima + " | quantidade atual:" + this.qtdAtual);
	}

	public boolean precisaRepor(){
		if(qtdAtual < qtdMinima){
			return true ;
		}
		return false;
	}
}