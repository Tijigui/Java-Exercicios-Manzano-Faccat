package operadores_logicos;

import java.util.Scanner;

public class Ex_01_Conversão_Fahrenheit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		float Celsiu = sc.nextFloat();
		
		float Fahrenheit = (9 * Celsiu + 160) / 5;
		
		System.out.println("Feita a conversão de Celsiu para Fahrenheit obteve-se: " + Fahrenheit);
		
		sc.close();
	}
}
