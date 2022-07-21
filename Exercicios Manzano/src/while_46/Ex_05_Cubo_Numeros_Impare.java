package while_46;

import java.lang.Math;

public class Ex_05_Cubo_Numeros_Impare {

	public static void main(String[] args) {

		int contadora = 0;
		
		while (contadora <= 15) {
			int resultado = (int) Math.pow(contadora,3 );
			System.out.println(contadora+ " ao cubo é: "+resultado );
			contadora++;
	}
	}
}

//Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser
//considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que
//neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).