package operadores_logicos;

import java.util.Scanner;

public class Ex_02_Conversão_Celsius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a temperatura em Fahrenheit: ");
		float Fahrenheit = sc.nextFloat();

		float Celsius = (Fahrenheit - 32) * (5 / 9);

		System.out.println("Feita a conversão de Fahrenheit para Celsius obteve-se: " + Celsius);

		sc.close();
	}
}
