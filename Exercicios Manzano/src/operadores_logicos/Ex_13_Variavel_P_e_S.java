package operadores_logicos;

import java.util.Scanner;

public class Ex_13_Variavel_P_e_S {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("Informe um valor para A: ");
		int A =sc.nextInt();
		
		System.out.println("Informe um valor para B: ");
		int B =sc.nextInt();
		
		System.out.println("Informe um valor para C: ");
		int C =sc.nextInt();
		
		System.out.println("Informe um valor para D: ");
		int D =sc.nextInt();
		
		
		int P = A + C;
		
		int S=B+D;
		
		System.out.println("A variavel P tem o valor de: "+P);
		System.out.print("A variavel S tem o valor de: "+S);
		
		
		sc.close();

	}

}
//Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (vari�veis A, B, C e
//D). Ao final o programa deve apresentar o resultado do produto (vari�vel P) do primeiro com o terceiro
//valor, e o resultado do produto (vari�vel P) do primeiro com o terceiro valor, e o resultado da soma
//(vari�vel S) do segundo com o quarto valor.