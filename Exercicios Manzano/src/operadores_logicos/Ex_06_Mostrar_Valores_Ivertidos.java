package operadores_logicos;

import java.util.Scanner;

public class Ex_06_Mostrar_Valores_Ivertidos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um valor para A: ");
		int A = sc.nextInt();

		System.out.println("Informe um valor para B: ");
		int B = sc.nextInt();

		int C = A;
		
		 A = B;
		 
		 B=C;
		 
		 System.out.println("O valor trocado de A e B s�o: "+ A+" e "+ B);

	sc.close();
	}
}
//Ler dois valores (inteiros, reais ou caracteres) para as vari�veis A e B, e efetuar a troca dos valores de
//forma que a vari�vel A passe a possuir o valor da vari�vel B e a vari�vel B passe a possuir o valor da
//vari�vel A. Apresentar os valores trocados