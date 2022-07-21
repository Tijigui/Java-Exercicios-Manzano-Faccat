package operadores_logicos;

import java.util.Scanner;

public class Ex_05_Prestação_Atraso {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da prestação: ");
		float valor = sc.nextFloat();
		
		System.out.println("Digite o valor a ser somado a cada prestração atrasada: ");
		float taxa= sc.nextFloat();
		
		System.out.println("Digite o a quantidade de parcelas em atrasos: ");
		int tempo =sc.nextInt();
		
		float prestacao = valor +(valor*taxa/100)* tempo;
		
		System.out.println("O Valor das prestações em atraso final é:  "+ prestacao);
		
		sc.close();
	}

}
//Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula
//PRESTACAO  VALOR + (VALOR * TAXA/100) * TEMPO).