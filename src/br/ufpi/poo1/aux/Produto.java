package br.ufpi.poo1.aux;

import java.text.DecimalFormat;

public class Produto {

	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		if (precoVenda < this.precoCusto){
			
			System.out
					.println("O preço de venda não pode ser menor que o preço de"
							+ " custo, que é: " + getPrecoCusto());
			return;
		}
		this.precoVenda = precoVenda;
	}

	public double getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double valor) {
		this.precoCusto = valor;
	}
	
	public double calcularMargemLucro(){
		return (this.precoVenda - this.precoCusto);
	}
	
	public String getMargemLucroPorcentagem(){
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format( 100 * calcularMargemLucro()/this.precoCusto )+"%";
	}
	

}
