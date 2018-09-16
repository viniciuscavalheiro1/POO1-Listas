package br.ufpi.poo1.listas;

import java.util.Scanner;

import br.ufpi.poo1.aux.Conta_3;
import br.ufpi.poo1.aux.Pessoa;
import br.ufpi.poo1.aux.Produto;

public class Lista3 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// questao1();
		//questao2();
		questao3();
	}

	private static void questao1() {
		Pessoa p = new Pessoa();

		p.setNome("Alcemir");
		p.setIdade(10);
		p.setAltura(100.0);
		p.setPeso(76.5);

		System.out.println("Nome: " + p.getNome());
		System.out.println("Idade: " + p.getIdade());
		System.out.println("Altura: " + p.getAltura() + "cm");
		System.out.println("Massa Corporal: " + p.getPeso() + "Kg");

		System.out.println("IMC: " + p.getIMC());

		p.imprime();
	}

	private static void questao2() {
		Produto p = new Produto();
		System.out.print("preço de custo: ");
		p.setPrecoCusto(Double.valueOf(sc.next()));
		do {
			System.out.print("preço de venda: ");
			p.setPrecoVenda(Double.valueOf(sc.next()));
		} while (p.getPrecoVenda() <= 0.0);

		System.out.println("Preço Custo (R$): " + p.getPrecoCusto());
		System.out.println("Preço Venda (R$): " + p.getPrecoVenda());
		System.out.println("Margem Lucro (R$): " + p.calcularMargemLucro());
		System.out.println("Margem Lucro (%): " + p.getMargemLucroPorcentagem());
	}
	
	private static void questao3() {

        Conta_3 conta1 = new Conta_3(1, "Joao", 100.00);

        Conta_3 conta2 = new Conta_3(2, "Jessica", 4000.00);
        conta1.saca(2500.00);
        conta1.deposita(300.00);
        conta2.saca(1000.00);
        conta1.imprimeNome();
        conta2.imprimeNome();
        conta2.transfere(conta1, 2000.00);
        conta1.transfere(conta2, 2500.00);
        conta1.imprimeNome();
        conta2.imprimeNome();        
        conta1.setNome("Joao");
        conta1.imprimeNome();

    }
}
