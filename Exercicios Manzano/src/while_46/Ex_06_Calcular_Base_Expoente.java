package while_46;

import java.util.Scanner;
import java.lang.Math;

public class Ex_06_Calcular_Base_Expoente {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Informe o valor da Base: ");
		int base =sc.nextInt();
		
		System.out.print("Informe o valor do Expoente: ");
		int expoente= sc.nextInt();
		
		int resultado= (int) (Math.pow(base, expoente));
		
		
		System.out.println("Feita a exponenciação o resultado da Base "+ base +" e o Expoente "+expoente+" é: "+resultado);
		sc.close();

	}

}
//Elaborar um programa que apresente como resultado o valor de uma potência de uma base
//qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o valor da base e E o valor
//do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do
//portuguol (^).