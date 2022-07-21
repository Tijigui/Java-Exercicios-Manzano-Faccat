package operadores_logicos;

import java.util.Scanner;

public class Ex_10_Conversor_Dolar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite quantos reais voce possui na carteira: ");
		float reais = sc.nextFloat();

		System.out.print("Informe o valor do dolar: ");
		float cotacaoDolar = sc.nextFloat();

		float dolar = (float) (reais / cotacaoDolar);

		System.out.println("Feita a conversão de " + reais + " é: " + dolar);

		sc.close();
	}

}
