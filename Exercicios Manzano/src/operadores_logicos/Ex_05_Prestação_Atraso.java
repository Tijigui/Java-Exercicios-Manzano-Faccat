package operadores_logicos;

import java.util.Scanner;

public class Ex_05_Presta��o_Atraso {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da presta��o: ");
		float valor = sc.nextFloat();
		
		System.out.println("Digite o valor a ser somado a cada prestra��o atrasada: ");
		float taxa= sc.nextFloat();
		
		System.out.println("Digite o a quantidade de parcelas em atrasos: ");
		int tempo =sc.nextInt();
		
		float prestacao = valor +(valor*taxa/100)* tempo;
		
		System.out.println("O Valor das presta��es em atraso final �:  "+ prestacao);
		
		sc.close();
	}

}
//Efetuar o c�lculo e a apresenta��o do valor de uma presta��o em atraso, utilizando a f�rmula
//PRESTACAO  VALOR + (VALOR * TAXA/100) * TEMPO).