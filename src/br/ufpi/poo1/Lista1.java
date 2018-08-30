package br.ufpi.poo1;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lista1 {

	static Scanner sc = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#.##");

	public static void main(String[] args) throws ParseException {
		// questao1();
		// questao2();
		// questao3();
		// questao4();
		// questao5();
		// questao6();
		// questao7();
		// questao8(324.0, 2342.8);
		// questao9(5, 9);
		// questao10(8.4, 3.6);
		// questao11();
		// questao12();
		// questao13();
		// questao14();
		// questao15();
		// questao16();
		// questao17();
		questao18();
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

	/**
	 * 7. Dada uma data no formato ddmmaa, exibir os dia, mês e ano separadamente.
	 * @throws ParseException 
	 */
	private static void questao7() throws ParseException {
		System.out.print("Digite a data no formato (ddmmaa): ");
		String sdata=sc.nextLine();
		int data = Integer.valueOf(sdata);
		int dia = data/10000;
		data-=dia*10000;
		int mes = data/100;
		data-=mes*100;
		int ano = data;
		System.out.println(dia+"/"+mes+"/"+ano);
		
		DateFormat df = new SimpleDateFormat("ddMMyy");
        Date date = df.parse(sdata);
        System.out.println("Java Date = " + date.toString());
	}

	/**
	 * 8. Dados os valores do salário mínimo e o salário de uma pessoa, exibir 
	 * quantos salários mínimos essa pessoa ganha.
	 */
	private static void questao8(double minimo, double salario) {
		System.out.println("A pessoa ganha "+ Math.floor(salario/minimo));		
	}
	
	/**
	 * 9. Faça um programa em Java que leia dois valores inteiros e mostre a soma,
subtração, multiplicação.
	 */
	private static void questao9(int a, int b) {
		System.out.println("Soma: "+ (a+b));
		System.out.println("Subtracao: "+ (a-b));
		System.out.println("Multiplicacao: "+ (a*b));
	}
	
	/**
	 * 10. Escreva um programa que leia duas notas e receba do usuário os valores 
	 * dessas notas, calcule a média e mostre o resultado da média na tela.
	 */
	private static void questao10(double n1, double n2) {
		System.out.println("A média aritmética é: "+ (n1+n2)/2);
	}
	
	/**
	 * 11. Faça um programa que peça uma nota, entre zero e dez. Mostre uma 
	 * mensagem caso o valor seja inválido e continue pedindo até que o usuário 
	 * informe um valor válido.
	 */
	private static void questao11() {
		double nota;
		do{
			System.out.print("digite uma nota entre 0 e 10:");
			nota = sc.nextDouble();
		}while(nota<0 || nota>10);

	}
	
	/**
	 * 12. Faça um programa que leia um nome de usuário e a sua senha e não aceite 
	 * a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando 
	 * a pedir as informações.
	 */
	private static void questao12() {
		String user;
		String senha;
		do{
			System.out.print("digite o nome do usuario: ");
			user = sc.next();
			System.out.println("digite a senha do usuario:");
			senha = sc.next();
		}while(!user.equals(senha));
	}
	
	/**
	 * 
	 */
	private static void questao13() {
		// a. Nome: maior que 3 caracteres;
		String nome;
		do {
			System.out.print("digite o nome: ");
			nome = sc.next();
		} while (nome.length() <= 3);

		// b. Idade: entre 0 e 150;
		Integer idade;
		do {
			System.out.print("digite a idade: ");
			idade = Integer.valueOf(sc.next());
		} while (idade < 0 || idade > 150);

		// c. Salário: maior que zero;
		Double salario;
		do{
			System.out.print("digite o salário: ");
			salario = Double.valueOf(sc.next());			
		}while(salario<=0);
		
		// d. Sexo: 'f' ou 'm';
		String sexo;
		do{
			System.out.print("digite o sexo (m/f): ");
			sexo = sc.next();
		}while(!sexo.toLowerCase().equals("f") || !sexo.toLowerCase().equals("m"));
		
		// e. Estado Civil: 's', 'c', 'v', 'd';
		String estado;
		do{
			System.out.print("digite o sexo (s/c/v/d): ");
			estado = sc.next();
		}while(!estado.toLowerCase().equals("s") || 
				!estado.toLowerCase().equals("c") ||
				!estado.toLowerCase().equals("v") || 
				!estado.toLowerCase().equals("d"));
		
	}

	/**
	 * 14. Supondo que a população de um país A seja da ordem de 80000 habitantes 
	 * com uma taxa anual de crescimento de 3% e que a população de B seja 200000 
	 * habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule
	 * e escreva o número de anos necessários para que a população do país A 
	 * ultrapasse ou iguale a população do país B, mantidas as taxas de 
	 * crescimento.
	 */
	private static void questao14(){
		int populacaoA = 80000, populacaoB = 200000, numeroDeAnos=0;
		double taxaA = 0.03, taxaB = 0.015;
		do{
			populacaoA += populacaoA*taxaA;
			populacaoB += populacaoB*taxaB;
			numeroDeAnos++;
		}while(populacaoB > populacaoA);
		System.out.println(String.format("Levaram %d anos para a população B ficar maior que a população A!", numeroDeAnos));
	}
	
	/**
	 * 15. Altere o programa anterior permitindo ao usuário informar as populações 
	 * e as taxas de crescimento iniciais. Valide a entrada e permita repetir a 
	 * operação.
	 */
	private static void questao15(){
		int numeroDeAnos=0;
		String entrada;

		while(true){
			System.out.println("Novo round!\n========");
			System.out.print("Digite a população A ou 'fim' para sair: ");
			entrada = sc.next();
			if(entrada.toLowerCase().equals("fim")) break;
			int populacaoA = Integer.valueOf(entrada);
			
			System.out.print("Digite a população B ou 'fim' para sair: ");
			entrada = sc.next();
			if(entrada.toLowerCase().equals("fim")) break;
			int populacaoB = Integer.valueOf(entrada);
			
			System.out.print("Digite a taxa A ou 'fim' para sair: ");
			entrada = sc.next();
			if(entrada.toLowerCase().equals("fim")) break;
			double taxaA = Double.valueOf(entrada);
			
			System.out.print("Digite a taxa B ou 'fim' para sair: ");
			entrada = sc.next();
			if(entrada.toLowerCase().equals("fim")) break;
			double taxaB = Double.valueOf(entrada);
			
			do{
				populacaoA += populacaoA*taxaA;
				populacaoB += populacaoB*taxaB;
				numeroDeAnos++;
			}while(populacaoB > populacaoA);
			
			System.out.println(String.format("Levaram %d anos para a população B ficar maior que a população A!", numeroDeAnos));
		}
	}
	
	/**
	 * 16. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do 
	 * outro. Depois modifique o programa para que ele mostre os números um ao lado 
	 * do outro.
	 */
	private static void questao16(){
		for(int i=1; i<21; i++){
			System.out.println(i);
		}
		for(int i=1; i<21; i++){
			System.out.print(i+",");
		}
	}
	
	/**
	 * 17. Faça um programa que leia 5 números e informe o maior número.
	 */
	public static void questao17() {
		System.out.println("Digite cinco numeros: ");

		int[] digitos = new int[5];

		int maior = Integer.MIN_VALUE;
		for (int i = 0; i < 5; i++) {
			digitos[i] = Integer.valueOf(sc.nextLine());
			if (digitos[i] > maior)
				maior = digitos[i];
		}
		System.out.println("o maior número é: " + maior);
	}
	/**
	 * 18. Faça um programa que leia 5 números e informe a soma e a média dos 
	 * números.
	 */
	private static void questao18(){
		System.out.print("Digite um número: ");
		String entrada = sc.next();
		double num1 = Double.valueOf(entrada);
		
		System.out.print("Digite um número: ");
		entrada = sc.next();
		double num2 = Double.valueOf(entrada);
		
		System.out.print("Digite um número: ");
		entrada = sc.next();
		double num3 = Double.valueOf(entrada);
		
		System.out.print("Digite um número: ");
		entrada = sc.next();
		double num4 = Double.valueOf(entrada);
		
		double soma = num1+num2+num3+num4;
		System.out.println(String.format("A soma dos números é '%d'", soma));
		System.out.println(String.format("A média dos números é '%d'", soma/4));
	}
	}
}
