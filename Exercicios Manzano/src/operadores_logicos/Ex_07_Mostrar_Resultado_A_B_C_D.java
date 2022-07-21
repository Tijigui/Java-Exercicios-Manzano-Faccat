package operadores_logicos;

import java.util.Scanner;

public class Ex_07_Mostrar_Resultado_A_B_C_D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma valor: ");
		float A = sc.nextFloat();

		System.out.print("Digite uma valor: ");
		float B = sc.nextFloat();

		System.out.print("Digite uma valor: ");
		float C = sc.nextFloat();

		System.out.print("Digite uma valor: ");
		float D = sc.nextFloat();

		int somaA = (int) (A + B);
		int multiplicacaoA = (int) (A * B);

		int somaB = (int) (B + C);
		int multiplicacaoB = (int) (B * C);
		
		int somaC = (int) (C+A);
		int multiplicacaoC=(int) (C*A);
		
		int somaD = (int) (D+A);
		int multiplicacaoD=(int) (D*A);
		
		System.out.println(somaA);
		System.out.println(multiplicacaoA);
		System.out.println(somaB);
		System.out.println(multiplicacaoB);
		System.out.println(somaC);
		System.out.println(multiplicacaoC);
		System.out.println(somaD);
		System.out.println(multiplicacaoD);

		sc.close();
	}
}
//Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, baseando-se na
//utilização do conceito da propriedade distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D,
//devem ser somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim
//C com D. Perceba que será necessário efetuar seis operações de adição e seis operações de
//multiplicação e apresentar doze resultados de saída.