package br.ufpi.poo1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista1 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		
		questao1();

		
	}

	/**
	 * 1. Fazer um algoritmo que receba com entrada o saldo de uma aplicação e 
	 * exiba como resultado o novo saldo após um reajuste de 10%.
	 */
	private static void questao1() {
		System.out.print("Digite o saldo da aplicação: ");
		double saldo = Double.valueOf(sc.nextLine());
		DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("O saldo após o reajuste é:" +df.format(saldo*1.1));
	}
	}
}
