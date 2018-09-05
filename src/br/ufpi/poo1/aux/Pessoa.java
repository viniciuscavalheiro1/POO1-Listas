package br.ufpi.poo1.aux;

public class Pessoa {

	private String nome;
	private int idade;
	private double altura;
	private double peso;

	public Pessoa(String umNome, int umaIdade, double umaAltura, double umPeso) {
		setNome(umNome);
		setIdade(umaIdade);
		setAltura(umaAltura);
		setPeso(umPeso);
	}
	
	public Pessoa() {
		this("", 0, 0.0, 0.0);
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}



	public void setNome(String cliente) {
		this.nome = cliente;
	}

	public String getNome() {
		return this.nome;
	}


	public double getIMC() {
		return peso/(altura * altura);
	}

	public void imprime() {
		System.out.println("Nome: "+ getNome());
		System.out.println("Idade: "+ getIdade());
		System.out.println("Altura: " +getAltura()+"cm");
		System.out.println("Massa Corporal: "+getPeso()+"Kg");
	}

}
