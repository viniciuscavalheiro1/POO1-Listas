package br.ufpi.poo1.listas;

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
		// questao18();
		// questao19();
		// questao20();
		// questao21();
		// questao22();
		// questao23();
		// questao24();
		// questao25();
		// questao26();
		// questao27();
		// questao28();
		// questao29();
		// questao30();
		// questao31();
		// questao32();
		// questao33();
		// questao34();
		// questao35();
		// questao36();
		// questao37();
		// questao38();
		// questao39();
		// questao40();
		// questao41();
		// questao42();
		// questao43();
		//questao44();
		//questao45();
		questao46();
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
	
	/**
	 * 19. Faça um programa que imprima na tela apenas os números ímpares entre 1 e
	 *  50.
	 */
	private static void questao19(){
		for(int i=2;i<50;i++){
			if(i%2==1)
				System.out.println(i);
		}
	}
	
	/**
	 * 20. Faça um programa que receba dois números inteiros e gere os números 
	 * inteiros 	que estão no intervalo compreendido por eles.
	 */
	private static void questao20(){
		System.out.print("digite um número inteiro: ");
		int num1 = Integer.valueOf(sc.next());
		System.out.print("digite um número inteiro: ");
		int num2 = Integer.valueOf(sc.next());
		for(int i=num1; i<=num2; i++){
			System.out.print(i+",");
		}
	}
	
	/**
	 * 21. Altere o programa anterior para mostrar no final a soma dos números.
	 */
	private static void questao21(){
		System.out.print("digite um número inteiro: ");
		int num1 = Integer.valueOf(sc.next());
		System.out.print("digite um número inteiro: ");
		int num2 = Integer.valueOf(sc.next());
		int soma = 0;
		for(int i=num1; i<=num2; i++){
			System.out.print(i+",");
			soma += i;
		}
		System.out.println("\nSoma do intervalo = " + soma);
	}
	
	/**
	 * 22. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
	 *	número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja
	 *	ver a tabuada. A saída deve ser conforme o exemplo abaixo: 
	 */
	private static void questao22() {
		System.out.print("digite um número inteiro: ");
		int num = Integer.valueOf(sc.next());
		for(int c = 1; c <= 10; c++) {
			System.out.printf("%d x %d = %d\n", num, c, (num * c));
		}
	}
	
	/**
	 * 23. Faça um programa que peça dois números, base e expoente, calcule e mostre o
	 *	primeiro número elevado ao segundo número. Não utilize a função de potência da
	 *  linguagem.
	 */
	static void questao23(){
        
        System.out.println("Tabela de preços");
        double numero = 0;
        for(int i = 1 ; i <= 50; i++){
            numero = numero + 1.99;
            System.out.printf("Intem %d - %.2f \n", i, numero);                
        }
        
    }

	/*
	 * 24. Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade
	 * de números pares e a quantidade de números impares.
	 */
	static void questao24(){

		System.out.print("Informe o preço do pão: ");
		float precoPao = sc.nextFloat();
		System.out.printf("Preço do pão: R$ %.2f\n", precoPao);
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		for(int cont = 1; cont <= 50; cont++){
			System.out.printf("%d - R$ %.2f\n", cont, cont*precoPao);
		}

	}
	
	/*
	 * 25. A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um
	 *programa capaz de gerar a série até o n−ésimo termo.
	 */
	
	static void questao25(){
        System.out.println("Lojas Tabajara");
        int produtos;
        double valor ;
        double result = 0 ;
        double total ;
        int repetir ;
        
        do{
        for(int i = 1; i <= 1000; i++){
            System.out.printf("Produto %d: \n", i);
            valor = sc.nextDouble();
            if(valor == 0){
                break;
            }
            result = valor + result;
            
        }
            System.out.printf("total %.2f \n", result);
            System.out.println("dinheiro: ");
            total = sc.nextDouble();
            total = total-result;
            System.out.printf("troco: %.2f \n", total);
            System.out.println("deseja repetir? ");
            System.out.println("sim[1]//nao[2]");
            repetir = sc.nextInt();
            
               
        }while(repetir != 2);
    }

	/*
	 * 26. A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... Faça
	 * um programa que gere a série até que o valor seja maior que 500.
	 */
	static void questao26(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe um numero para o fatorial: ");
		int fat = sc.nextInt();
		System.out.printf("O Fatorial de: %d o %d! = ", fat, fat);
		for(int cont = fat-1; cont >= 1; cont--){
			fat *= cont;
			System.out.printf("%d", cont);
			if(cont > 1){
				System.out.printf(".");
			}
		}
		System.out.printf(" = %d\n", fat);
	}
	
	/*
	 * 27. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo
	 * usuário. Ex.: 5!=5.4.3.2.1=120
	 */

	static void questao27(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de temperaturas colhidas");
		int quanTemp = sc.nextInt();
		float[] temperaturas = new float[quanTemp];
		float menor = 100;
		float maior = 0;
		float media = 0;
		for(int cont = 0; cont < quanTemp; cont++){
			System.out.printf("Informe a %d temperatura: ", cont+1);
			temperaturas[cont] = sc.nextFloat();
			media += temperaturas[cont];
			if(temperaturas[cont] < menor){
				menor = temperaturas[cont];
			}
			if(temperaturas[cont] > maior){
				maior = temperaturas[cont];
			}
		}

		System.out.printf("A media foi %.2f, maior temperatura %.2f e menor temperatura %.2f\n", (media/quanTemp), maior, menor);
	}

	/*
	 * 28. Faça um programa que peça um número inteiro e determine se ele é ou não um
	 * número primo. Um número primo é aquele que é divisível somente por ele
     * mesmo e por 1. 
	 */
	static void questao28(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe um numero: ");
		int num = sc.nextInt();
		int cont = 0;
		for(int c = 1; c <= num; c++){
			if(num % c == 0){
				cont++;
			}
		}
		if(cont == 2){
			System.out.printf("O numero %d eh primo.\n", num);
		}else{
			System.out.printf("O numero %d não eh primo\n.", num);
		}

	}
	
	/*
	 * 29. Faça um programa que calcule o mostre a média aritmética de N notas.
	 */
	static void questao29(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe um numero: ");
		int num = sc.nextInt();
		int cont = 0;
		for(int c = 1; c <= num; c++){
			for(int k = 1; k <= num; k++){
				if(c % k == 0){
					cont++;
				}
			}
			if(cont == 2){
				System.out.printf("O numero %d eh primo. \n", c);
			}
			cont = 0;
		}
	}
	
	/*
	 * 30. Faça um programa que peça para n pessoas a sua idade, ao final o programa
	 * devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior
	 * que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média
	 * calculada.
	 */
	static void questao30(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Montar a tadoada de: ");
		int num = sc.nextInt();
		System.out.print("Começar por: ");
		int inicio = sc.nextInt();
		System.out.print("Terminar em: ");
		int fim = sc.nextInt();
		if(fim < inicio){
			int aux = fim;
			fim = inicio;
			inicio = aux;
		}
		for(int cont = inicio; cont <= fim; cont++){
			System.out.printf("%d x %d = %d\n", num, cont, (num * cont));
		}
	}
	
	/*
	 * 31. Faça um programa que calcule o número médio de alunos por turma. Para isto,
  	 * peça a quantidade de turmas e a quantidade de alunos para cada turma. As
     * turmas não podem ter mais de 40 alunos.
	 */
	static void questao31(){
		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();
		double almento = sc.nextDouble();
		salario += (salario * almento)/100;
		System.out.println(salario);
		for(int cont = 1997; cont <= 2018; cont++){
			salario += (salario * almento)/100;
			almento = almento * 2;
		}
		System.out.printf("O salario atual do mesmo eh: %.2f\n", salario);
	}
	/*
	 * 32. Faça um programa que calcule o valor total investido por um colecionador em sua
	 * coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá
	 * informar a quantidade de CDs e o valor para em cada um.
	 */
	static void questao32(){
        Scanner teclado32 = new Scanner(System.in);
        int escolha , i = 0;
        double quantidade = 0;
        int comida100 = 100,comida101 = 101, comida102 = 102, comida103 = 103, comida104 = 104, comida105 = 105;
        System.out.println("Cardapio da lanchonete: ");
        System.out.println("[100]Cachorro quente - R$1,20");
        System.out.println("[101]Bauru simples - R$1,30");
        System.out.println("[102]Bauru com ovo - R$1,50");
        System.out.println("[103]Hamburguer - R$1,20");
        System.out.println("[104]Cheeseburguer - R$1,30");
        System.out.println("[105]Refrigerante - R$1,00");
        do{
    
         escolha = teclado32.nextInt();
        if(escolha == 100){
                System.out.println("escolha a quantidade");
                i = teclado32.nextInt();
                quantidade = quantidade + (i * 1.20);
                
        }else if(escolha == 101){
            System.out.println("escolha a quantidade");
                i = teclado32.nextInt();
                quantidade = quantidade + (i * 1.30);
            
        }else if(escolha == 102){
            System.out.println("escolha a quantidade");
                i = teclado32.nextInt();
                quantidade = quantidade + (i * 1.50);
        
        }else if(escolha == 103){
            System.out.println("escolha a quantidade");
            i = teclado32.nextInt();
            quantidade = quantidade + (i * 1.20);
            
        }else if(escolha == 104){
            System.out.println("escolha a quantidade");
            i = teclado32.nextInt();
            quantidade = quantidade + (i * 1.30);
            
        }else if(escolha == 105){
            System.out.println("escolha a quantidade");
            i = teclado32.nextInt();
            quantidade = quantidade + (i * 1.00);
            
            
        }
            System.out.println("escolha novamente ou digite 0 para sair");
            
        }while(escolha != 0);
       
        System.out.printf("valor a paga %.2f\n",quantidade);
    }
	
	/*
	 * 33. O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99, com cerca de
	 * 10 caixas. Para agilizar o cálculo de quanto cada cliente deve pagar ele
	 * desenvolveu uma tabela que contém o número de itens que o cliente comprou e
	 * ao lado o valor da conta. Desta forma a atendente do caixa precisa apenas contar
	 * quantos itens o cliente está levando e olhar na tabela de preços. Você foi
	 * contratado para desenvolver o programa que monta esta tabela de preços, que
	 * conterá os preços de 1 até 50 produtos, conforme o exemplo abaixo:
	 */
	static void questao33(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Infome o n termos: ");
        int n = sc.nextInt();
        double soma = 0;
        float m = 1;
        for(float i = 1; i <= n; i++){
            System.out.printf("%.0f/%.0f ", i, m);
            soma += i/m;
            if(i<n){
                System.out.printf("+ ");
            }
            m+=2;
        }
        System.out.printf("\nSoma: %f\n", soma);
    }
	
	/*
	 * 34. O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a
	 * metodologia da tabelinha, que já é um sucesso na sua loja de 1,99. Você foi
	 * contratado para desenvolver o programa que monta a tabela de preços de pães,
	 * de 1 até 50 pães, a partir do preço do pão informado pelo usuário, conforme o
	 * exemplo abaixo:
	 */
    static void questao34(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Infome N termos: ");
        int n = sc.nextInt();
        double soma = 0;
        float m = 1;
        for(float i = 1; i <= n; i++){
            System.out.printf("%.0f/%.0f ", i, m);
            soma += i/m;
            m+=1;
        }
        System.out.printf("\nValor de H: %f\n", soma);
    }
    
    /*
     * 35. O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e
     * 	Lojas Tabajara
     * 	Produto 1: R$ 2.20
     * 	Produto 2: R$ 5.80
     * 	Produto 3: R$ 0
     * 	Total: R$ 9.00
     * 	Dinheiro: R$ 20.00
     * 	Troco: R$ 11.00
     * ...agora possui uma loja de conveniências. Faça um programa que implemente uma
     * caixa registradora rudimentar. O programa deverá receber um número
     * desconhecido de valores referentes aos preços das mercadorias. Um valor zero
     * deve ser informado pelo operador para indicar o final da compra. O programa
     * deve então mostrar o total da compra e perguntar o valor em dinheiro que o
     * cliente forneceu, para então calcular e mostrar o valor do troco. Após esta
     * operação, o programa deverá voltar ao ponto inicial, para registrar a próxima
     * compra. A saída deve ser conforme o exemplo abaixo: 
     */
    static void questao35(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Infome o n termos: ");
        int n = sc.nextInt();
        double soma = 0;
        float m = 1;
        for(float i = 1; i <= n; i++){
            System.out.printf("%.0f/%.0f ", i, m);
            soma += i/m;
            if(i<n){
                System.out.printf("+ ");
            }
            m+=2;
        }
        System.out.printf("\nSoma: %f\n", soma);
    }
    
    /*
     * 36. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo
     * usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser conforme o exemplo abaixo: o
     * Fatorial de: 5 o 5! = 5 . 4 . 3 . 2 . 1 = 120
     */
    static void questao36(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Infome o n termos: ");
        int n = sc.nextInt();
        double soma = 0;
        float m = 1;
        for(float i = 1; i <= n; i++){
            soma += i/m;
  	            m++;
        }
        System.out.printf("\nValor de H: %f\n", soma);
    }
    
    /*
     * 37. O Departamento Estadual de Meteorologia lhe contratou para desenvolver um
     * programa que leia as um conjunto indeterminado de temperaturas, e informe ao
     * final a menor e a maior temperaturas informadas, bem como a média das
     * temperaturas.
     */
    private static void questao37() {
    	System.out.println("quantidade de temperaturas: ");
    	int c = sc.nextInt();
    	double[] temp = new double[c];
    	double maior = 0;
    	double media = 0;
    	double menor = 1000;
    	for(int cont = 0; cont < c; cont++) {
    		System.out.printf("Informe a %d temperatura: \n", cont+1);
    		temp[cont] = sc.nextDouble();
    		media += temp[cont];
    		if (temp[cont] > maior) {
    			maior = temp[cont];
    		}
    		if (temp[cont] < menor) {
    			menor = temp[cont];
    		}
    	}
    	System.out.println("Maior temperatura: " + maior);
    	System.out.println("Menor temperatura: " + menor);
    	System.out.println("Media das temperaturas: " + (media/c));
    }
    
    /*
     * 38. Os números primos possuem várias aplicações dentro da Computação, por
	 * exemplo na Criptografia. Um número primo é aquele que é divisível apenas por
	 * um e por ele mesmo. Faça um programa qu
     */
    private static void questao38() {
    	System.out.println("Informe um numero:");
    	int num = sc.nextInt();
    	int cont_aux = 0;
    	for(int c = 1; c <= num; c++) {
    		if (num % c == 0) {
    			cont_aux++;
    		}
    	}
    	if (cont_aux == 2) {
    		System.out.println(num + " é primo!");
    	}else {
    		System.out.println("Não é primo");
    	}
    }
    
    /*
     * 39. Encontrar números primos é uma tarefa difícil. Faça um programa que gera uma
     * lista dos números primos existentes entre 1 e um número inteiro informado pelo
     * usuário.
     */
    private static void questao39() {
    	System.out.println("Informe um numero:");
    	int num = sc.nextInt();
    	for(int c = 1; c <= num; c++) {
    		int aux = 0;
    		for(int k = 1; k <= c; k++) {
    			if (c % k == 0) {
    				aux += 1;
    			}
    		}
    		if (aux == 2) {
    			System.out.println(c + " é primo");
    		}
    			
    	}
    }
    
    /*
     * 40. Desenvolva um programa que faça a tabuada de um número qualquer inteiro que
     * será digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1
     * Montar a tabuada de: 5
     * Começar por: 4
     * Terminar em: 7
     * Vou montar a tabuada de 5 começando em 4 e terminando em 7:
     * 5 X 4 = 20
     * 5 X 5 = 25
     * 5 X 6 = 30
     * 5 X 7 = 35
     * Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.
     * e terminar em 10, o valor inicial e final devem ser informados também pelo
     * usuário, conforme exemplo abaixo:
     */
    private static void questao40() {
    	System.out.println("Começar por:");
    	int inicio = sc.nextInt();
    	System.out.println("Terminar em:");
    	int fim = sc.nextInt();
    	for(; inicio <= fim; inicio++) {
    		System.out.println(fim + " x " + inicio + " = " + (fim*inicio));
    	}
    }
    
    /*
     * 41. Um funcionário de uma empresa recebe aumento salarial anualmente: Sabe-se
     * que:
     * 
     * a. Esse funcionário foi contratado em 1995, com salário inicial de R$
     * 1.000,00; a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
     * 
     * b. A partir de 1997 (inclusive), os aumentos salariais sempre
     * correspondem ao dobro do percentual do ano anterior.
     * Faça um programa que determine o salário atual desse funcionário.
     * Após concluir isto, altere o programa permitindo que o usuário digite o
     * salário inicial do funcionário.
     */
    private static void questao41() {
    	double aumento = 1.5;
    	System.out.println("Informe o salario inicial: ");
    	double salario = sc.nextDouble();
    	for (int c = 1997; c <= 2018; c+=1000) {
    		aumento *= 2;
    		salario = salario + (salario * 2);
    	}
    	System.out.println("Salario com rasjuste: " + salario);
    }
    
    /*42. O cardápio de uma lanchonete é o seguinte:
     * 
     * Especificação
     * Cachorro Quente
     * Bauru Simples
     * Bauru com ovo
     * Hambúrguer
     * Cheeseburguer
     * Refrigerante
     * Código
     * 100
     * 101
     * 102
     * 103
     * 104
     * 105
     * Preço
     * R$ 1,20
     * R$ 1,30
     * R$ 1,50
     * R$ 1,20
     * R$ 1,30
     * R$ 1,00
     * Faça um programa que leia o código dos itens pedidos e as quantidades desejadas.
     * Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral
     * do pedido. Considere que o cliente deve informar quando o pedido deve ser
     * encerrado.
    */
    private static void questao42() {
    	System.out.println("Especificação     Código Preço      Preço  ");
    	System.out.println("Cachorro Quente        100         R$ 1,20 ");
    	System.out.println("Bauru Simples          101         R$ 1,30 ");
    	System.out.println("Bauru com ovo          102         R$ 1,50 ");
    	System.out.println("Hambúrguer             103         R$ 1,20 ");
    	System.out.println("Cheeseburguer          104         R$ 1,30 ");
    	System.out.println("Refrigerante           105         R$ 1,00 ");
    	
    	System.out.println("Informe o codigo do produto: ");
    	int cod = sc.nextInt();
    	System.out.println("Informe a quantidade");
    	int quant = sc.nextInt();
    	if (cod == 100) {
    		System.out.println("Valor a pagar: " + (quant * 1.20));
    	}else if (cod == 101) {
    		System.out.println("Valor a pagar: " + (quant * 1.30));
    	}else if (cod == 102) {
    		System.out.println("Valor a pagar: " + (quant * 1.30));
    	}else if (cod == 103) {
    		System.out.println("Valor a pagar: " + (quant * 1.20));
    	}else if (cod == 104) {
    		System.out.println("Valor a pagar: " + (quant * 1.30));
    	}else if (cod == 105) {
    		System.out.println("Valor a pagar: " + (quant * 1.00));
    	}    	
    }
    
    /*
     * 43. Faça um programa que mostre os n termos da Série a seguir:
     * S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m
     */
    private static void questao43() {
    	System.out.println("Informe o valor de N: ");
    	int n = sc.nextInt();
    	
    	int m = 1;
    	System.out.printf("s = ");
    	for(int c = 1; c <= n; c++) {
    		System.out.printf(" " + c + "/" + m);
    		m += 2;
    	}
    	System.out.println("");
    }
    
    /*
     * 44. Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que calcule o valor de
     * H com N termos.
     */
    private static void questao44() {
    	System.out.println("Informe o N termo: ");
    	int n = sc.nextInt();
    	int soma = 0;
    	System.out.printf("s = ");
    	for(int c = 1; c < n; c++) {
    		System.out.print(" 1/" + c);
    		soma += 1 / c;
    	}
    	System.out.println(" ");
    	System.out.println("A soma = " + soma);
    }
    
    /*
     * 45. Faça um programa que mostre os n termos da Série a seguir:
     * S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m
     */
    private static void questao45() {
    	System.out.println("Informe o valor de N: ");
    	int n = sc.nextInt();
    	
    	int m = 1;
    	System.out.printf("s = ");
    	for(int c = 1; c <= n; c++) {
    		System.out.printf(" " + c + "/" + m);
    		m += 2;
    	}
    	System.out.println("");
    }
    
    /*
     * 46. Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que calcule o valor de
     * H com N termos.
     */
    private static void questao46() {
    	System.out.println("Informe o valor de N: ");
    	int n = sc.nextInt();
    	int soma = 1;
    	int m = 1;
    	System.out.printf("s = 1 + ");
    	for(int c = 2; c <= n; c++) {
    		System.out.printf(" " + 1 + "/" + c);
    		soma += 1 / c;
    		m += 2;
    	}
    	System.out.println("\nSoma = " + soma);
    }
    
}
