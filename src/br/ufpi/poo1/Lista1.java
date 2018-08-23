package br.ufpi.poo1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista1 {

	static Scanner sc = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#.##");

	public static void main(String[] args) {
		// questao1();
		// questao2();
		// questao3();
		// questao4();
		//questao5();
		questao6();
	}

	/**
	 * 1. Fazer um algoritmo que receba com entrada o saldo de uma aplicação e
	 * exiba como resultado o novo saldo após um reajuste de 10%.
	 */
	private static void questao1() {
		System.out.print("Digite o saldo da aplicação: ");
		double saldo = Double.valueOf(sc.nextLine());
		System.out
				.print("O saldo após o reajuste é: " + df.format(saldo * 1.1));
	}

	/**
	 * 2. Faça um algoritmo que seja dado um valor para x como entrada para a
	 * função f(x) = 3x2 + 2x + 7. O programa deve exibir o valor de f(x).
	 */
	private static void questao2() {
		System.out.print("Digite o valor de \'x\': ");
		double x = Double.valueOf(sc.nextLine());
		System.out.print("O valor de f(x) é: " + (3 * x * x + 2 * x + 7));
	}

	/**
	 * 3. Faça um programa que receba um número e calcule seu antecessor e
	 * sucessor.
	 */
	private static void questao3() {
		System.out.print("Digite o valor de \'x\': ");
		int x = Integer.valueOf(sc.nextLine());
		System.out.println("Você digitou " + x + ".");
		System.out.println("O sucecessor de " + x + " é " + (x+1) + ".");
		System.out.println("O antecessor de " + x + " é " + (x-1) + ".");
	}

	/**
	 * 4. Faça um programa que receba dois números e calcule o resto da
	 * divisão do primeiro pelo segundo.
	 */
	private static void questao4() {
		System.out.print("Digite o valor de \'x\' diferente de 0: ");
		double x = Double.valueOf(sc.nextLine());
		System.out.print("Digite o valor de \'y\': ");
		double y = Double.valueOf(sc.nextLine());
		System.out.print("O resto da divisão x/y: "+ df.format(x%y));
	}

	/**
	 * 5. Fazer um algoritmo que receba como entrada a quantidade de horas
	 * trabalhadas por um professor e o valor de sua hora-aula. O algoritmo deve
	 * retornar o valor do salário do professor.
	 */
	private static void questao5() {
		System.out.print("Digite o valor de horas trabalhadas: ");
		double horas = Double.valueOf(sc.nextLine());
		System.out.print("Digite o valor da hora/aula: ");
		double valor = Double.valueOf(sc.nextLine());
		System.out.println("O salário do professor é "+ horas*valor);
	}

	/**
	 * 6. Sabendo que um carro faz 12Km com um litro de gasolina e que serão
	 * fornecidos a velocidade média e o tempo gasto em uma viagem, exibir:
	 * distância percorrida e quantidade de gasolina necessária para a viagem.
	 */
	private static void questao6() {
		System.out.print("Digite a velocidade média (em Km/h): ");
		double vm = Double.valueOf(sc.nextLine());
		System.out.print("Digite tempo gasto (em minutos): ");
		double t = Double.valueOf(sc.nextLine());
		double d = vm*t/60;
		double g = d/12;
		System.out.println("A distância percorrida foi "+ d +"Km e a gasolina "
				+ "necessária foi "+ df.format(g)+"L." );
	}

	}
}
