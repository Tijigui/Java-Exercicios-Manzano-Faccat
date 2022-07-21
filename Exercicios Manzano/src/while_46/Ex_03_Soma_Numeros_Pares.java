package while_46;

public class Ex_03_Soma_Numeros_Pares {

	public static void main(String[] args) {
		int contadora = 1;
		int acomuladora = 0;
		
		while (contadora<501) {
			if (contadora % 2 == 0) {
				acomuladora=acomuladora  + contadora;
		
			}
			contadora++;
		}
		System.out.println(acomuladora);
	}

}


//Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
//1 até 500.