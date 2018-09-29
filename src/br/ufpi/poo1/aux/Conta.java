package br.ufpi.poo1.aux;

public class Conta {
	public String nome_titular = "Antonio da Silva";
	public int numero = 00001;
	public String agencia = "00074-3";
	public double saldo = 0;
	public String data_abertura = "09/15/2018";

	public void saca(double valor){
		this.saldo -= valor;
	}

	public void deposita(double valor){
		this.saldo += valor;
	}

	public double calculaRendimento(){
		return(this.saldo*0.1);
	}

	public String recuperaDadosParaImpressao(){
		return ("Nome:"+nome_titular+" Numero:"+numero+" Agencia: "+agencia+" Saldo:"+saldo+" Data da abertura: "+ data_abertura);
	}
}