package operadores_logicos;

import java.util.Scanner;

public class Ex_09_Quadrado_Primeiro_Segundo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para A: ");
		float A = sc.nextFloat();
		
		System.out.println("Digite um valor para B: ");
		float B = sc.nextFloat();
		
		float diferencaA= (float) (A*A);
		float diferencaB = (float) (B*B);
		
		float diferencaTotal = (float) (diferencaA - diferencaB);
		
		System.out.println("A diferen�a  do quadrado de A e B �: " + diferencaTotal);
		
		sc.close();
	}

}
//Ler dois inteiros (vari�veis A e B) e imprimir o resultado do quadrado da diferen�a do primeiro valor pelo
//segundo.