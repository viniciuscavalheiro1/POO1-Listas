package br.ufpi.poo1.aux;

public class Conta_3 {
    private int numero;
    private String nome;
    private double saldo;

    public Conta_3(int numero, String nome, double saldo){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean saca(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void deposita(double valor){
        this.saldo+=valor;
    }

    public boolean transfere(Conta_3 destino, double valor){
        if(valor<=this.saldo){
           destino.deposita(valor);
           this.saca(valor);          
           return true;
        }
        return false;
    }

    public void imprimeNome(){
        System.out.println("Nome: "+nome);
        System.out.println("Saldo: "+getSaldo());
    }

}