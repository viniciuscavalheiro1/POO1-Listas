package br.ufpi.poo1.listas;

import java.util.Scanner;

import br.ufpi.poo1.aux.Conta;
import br.ufpi.poo1.aux.Estoque;
import br.ufpi.poo1.aux.Lampada;
import br.ufpi.poo1.aux.Quadrado;

public class Lista2 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// questao1e2();
		//questao3e4();
		//questao5_6_7();
		//questao8_9();
		
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
	
	static void questao5_6_7() {
		Scanner sc = new Scanner(System.in);
		int qtd, op;
		Estoque estoque = new Estoque();
		do{
			System.out.printf(" 1-Cadastrar\n 2-Mudar nome\n 3-Mudar Quantidade minima\n 4-Repor\n 5-Dar baixa\n 6-Mostrar\n 7-Status estoque\n 0- Sair\n");
			op = sc.nextInt();
			switch (op){
				case 1:
					System.out.print("Informe o nome:");
					estoque.nome = sc.next();
					System.out.print("Informe a quantidade atual: ");
					int valorAtual = sc.nextInt();
					if(valorAtual < 0){
						System.out.print("Valor invalido! informe novamente: ");
						valorAtual = sc.nextInt();
					}
					estoque.qtdAtual = valorAtual;
					System.out.print("Informe a quantidade minima: ");
					estoque.qtdMinima = sc.nextInt();
					break;
				case 2:
					System.out.print("Informe o novo nome: ");
					String _nome = sc.next();
					estoque.mudarNome(_nome);
					break;
				case 3:
					System.out.print("Informe a quantiade minima : ");
					int _qtdMinima = sc.nextInt();
					estoque.mudarQtdMinima(_qtdMinima);
					break;
				case 4:
					System.out.print("Informe a quantiade de reposicao : ");
					qtd = sc.nextInt();
					estoque.repor(qtd);
					break;
				case 5:
					System.out.print("Informe a quantiade de produtos : ");
					qtd = sc.nextInt();
					estoque.darBaixa(qtd);				
					break;
				case 6:
					System.out.println(estoque.mostra());
					break;
				case 7:
					if(estoque.precisaRepor() != true){
						System.out.println("Ainda tem muitos produtos no estoque");
					}else{
						System.out.println("Precisa fazer reposicao no estoque");
					}
					break;
			}
		}while(op != 0);
	}
	
	public static void questao8_9() {
		Estoque estoque1 = new Estoque();
		Estoque estoque2 = new Estoque();
		Estoque estoque3 = new Estoque();

		estoque1.nome = "Impressora Jato de Tinta";
		estoque1.qtdAtual = 13;
		estoque1.qtdMinima = 6;

		estoque2.nome = "Monitor LCD 17 polegadas";
		estoque2.qtdAtual = 11;
		estoque2.qtdMinima = 13;

		estoque3.nome = "Mouse Ótico";
		estoque3.qtdAtual = 6;
		estoque3.qtdMinima = 2;

		estoque1.darBaixa(5);
		estoque2.repor(7);
		estoque3.darBaixa(4);
		estoque1.precisaRepor();
		estoque2.precisaRepor();
		estoque3.precisaRepor();


		System.out.println(estoque1.mostra());
		System.out.println(estoque2.mostra());
		System.out.println(estoque3.mostra());
	}
	
	public static void questao7 (){
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		int op;
		do{
			System.out.printf("\n 1 - Sacar\n 2 - Depositar\n 3 - Calcular rendimento\n 4 - Dados Impressão\n 5 - Sair\n");
			op = sc.nextInt();
			switch(op){
				case 1:
					if(conta.saldo == 0){
						System.out.println("Voce está liso");
					}else{
						System.out.printf("Informe o quanto deseja sacar: ");
						double valor = sc.nextDouble();
						if(valor > conta.saldo){
							System.out.println("Voce não possue saldo suficiente para transação");
							break;
						}else{
							conta.saca(valor);
						}						
					}
					break;
				case 2:
					System.out.printf("Informe o quanto deseja depositar: ");
					double valor2 = sc.nextDouble();
					conta.deposita(valor2);
					break;
				case 3:
					System.out.printf("Rendimento : %.2f", conta.calculaRendimento());
					break;
				case 4:
					System.out.println(conta.recuperaDadosParaImpressao());
					break;
				case 5:
					break;
				default:
					System.out.println("Operacao invalida");
					break;

			}
		}while(op != 5);

	}
}
