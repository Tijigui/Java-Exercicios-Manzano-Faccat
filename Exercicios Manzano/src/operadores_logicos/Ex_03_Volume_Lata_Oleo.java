package operadores_logicos;

import java.util.Scanner;

public class Ex_03_Volume_Lata_Oleo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe a Altura da Lata: ");
	float altura = sc.nextFloat();
	
	System.out.println("Informe o Raio da Lata: ");
	float raio = sc.nextFloat();
	
	
	float volume = (float) 3.14 * ((raio*raio)* altura);
	
	System.out.println("O volume da lata de oléo é: "+ volume);
	
	sc.close();
}
}
