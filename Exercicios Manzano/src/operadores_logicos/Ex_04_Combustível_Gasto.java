package operadores_logicos;

import java.util.Scanner;

public class Ex_04_Combust�vel_Gasto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o tempo gasto na viajem: ");
		float tempo = sc.nextFloat();

		System.out.println("Informe a Velocidade M�dia: ");
		float velocidade = sc.nextFloat();

		float distancia = tempo * velocidade;

		float litros = distancia / 12;

		System.out.println("A velocidade M�dia �: " + velocidade);
		System.out.println("O tempo gasto na Viajem �: " + tempo + "/mins");
		System.out.println("A distancia percorrida �: " + distancia + "Km");
		System.out.println("A quantidade de litros utilizados �: " + litros + "Lts");

		sc.close();
	}
}