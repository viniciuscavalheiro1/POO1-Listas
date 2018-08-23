package br.ufpi.poo1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista1 {

	static Scanner sc = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#.##");
	
	public static void main(String[] args){
		//questao1();
		questao2();	
		
	}

	/**
	 * 1. Fazer um algoritmo que receba com entrada o saldo de uma aplicação e 
	 * exiba como resultado o novo saldo após um reajuste de 10%.
	 */
	private static void questao1() {
		System.out.print("Digite o saldo da aplicação: ");
		double saldo = Double.valueOf(sc.nextLine());
        System.out.print("O saldo após o reajuste é: " +df.format(saldo*1.1));
	}
	
	/**
	 * 2. Faça um algoritmo que seja dado um valor para x como entrada para a 
	 * função f(x) = 3x2 + 2x + 7. O programa deve exibir o valor de f(x).
	 */
	private static void questao2() {
		System.out.print("Digite o valor de \'x\': ");
		double x = Double.valueOf(sc.nextLine());
        System.out.print("O valor de f(x) é: " +df.format(3*x*x+2*x+7));
	}
	}
}
