package if_else;

import java.util.Scanner;

public class Ex_02_Mostrar_Positivo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um numero: ");
		float numero = sc.nextFloat();

		if (numero <= 0) {
			numero = numero * -1;
			System.out.println(numero);
		} else {
			System.out.println(numero);
		}
		sc.close();
	}
}

//Efetuar a leitura de um valor inteiro positivo ou negativo
//e apresentar o número lido como sendo um
//valor positivo, ou seja, o programa deverá apresentar o módulo de um número fornecido. Lembre-se
//de verificar se o número fornecido é menor que zero; sendo, multiplique-o por -1.