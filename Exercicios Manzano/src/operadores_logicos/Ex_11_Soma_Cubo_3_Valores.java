package operadores_logicos;

import java.util.Scanner;

public class Ex_11_Soma_Cubo_3_Valores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite um valor: ");
		float valor1= sc.nextFloat();
		
		System.out.print("Digite um valor: ");
		float valor2= sc.nextFloat();
		
		System.out.print("Digite um valor: ");
		float valor3= sc.nextFloat();
		
		float quadradoValor1 = (float) (valor1 * valor1); 
		float quadradoValor2 = (float) (valor2 * valor2);
		float quadradoValor3 = (float) (valor3 * valor3);
		
		float somaQuadrados = (float) (quadradoValor1+quadradoValor2+quadradoValor3);
		
		System.out.println("A soma dos quadrados dos tres valores é: " + somaQuadrados);
		
		sc.close();

	}

}


//Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final à
//soma dos quadrados dos três valores lidos.