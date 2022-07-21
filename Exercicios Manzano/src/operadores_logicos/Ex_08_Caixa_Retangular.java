package operadores_logicos;

import java.util.Scanner;

public class Ex_08_Caixa_Retangular {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Informe o comprimento da caixa: ");
		float comprimento = sc.nextFloat();
		
		System.out.println("Informe a largura da caixa: ");
		float largura = sc.nextFloat();
		
		System.out.println("Informe a altura da caixa: ");
		float altura = sc.nextFloat();
		
		
		float volume =(float) (comprimento*largura*altura);
		
		System.out.println("O volume da caixa retangular é: "+volume);
		
		sc.close();
	}

}
//Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula
//VOLUME  COMPRIMENTO * LARGURA * ALTURA.