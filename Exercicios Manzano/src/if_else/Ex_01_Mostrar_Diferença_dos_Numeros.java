package if_else;

import java.util.Scanner;

public class Ex_01_Mostrar_Diferen�a_dos_Numeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um Valor: ");
		float numero1 = sc.nextFloat();

		System.out.println("Digite um Valor: ");
		float numero2 = sc.nextFloat();

		int soma = (int) (numero1 + numero2);

		System.out.println("O resultado final �: "+ soma);

		if (numero1 > numero2) {
			int diferenca = (int) (numero1 - numero2);
			System.out.println("A diferente de " + numero1 + " para " + numero2 + " �: " + diferenca);

		} else {
			int diferenca = (int) (numero2 - numero1);
			System.out.println("A diferente de " + numero2 + " para " + numero1 + " �: " + diferenca);
		}

		sc.close();
	}
}

//Ler dois valores num�ricos inteiros e apresentar o resultado da diferen�a do maior pelo menor valor.