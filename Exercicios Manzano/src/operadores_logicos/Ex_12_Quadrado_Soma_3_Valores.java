package operadores_logicos;

import java.util.Scanner;

public class Ex_12_Quadrado_Soma_3_Valores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		float valor1 = sc.nextFloat();

		System.out.print("Digite um valor: ");
		float valor2 = sc.nextFloat();

		System.out.print("Digite um valor: ");
		float valor3 = sc.nextFloat();

		float somaValor = valor1 + valor2 + valor3;

		float quadradoSoma = somaValor * somaValor;

		System.out.println("O quadrado da soma dos 3 valores é: " + quadradoSoma);

		sc.close();

	}

}
//Elaborar um programa que efetue a leitura de três valores (A,B e C) e apresente como resultado final o
//quadrado da soma dos três valores lidos.