package while_46;

import java.lang.Math;

public class Ex_05_Cubo_Numeros_Impare {

	public static void main(String[] args) {

		int contadora = 0;
		
		while (contadora <= 15) {
			int resultado = (int) Math.pow(contadora,3 );
			System.out.println(contadora+ " ao cubo �: "+resultado );
			contadora++;
	}
	}
}

//Apresentar os resultados das pot�ncias de 3, variando do expoente 0 at� o expoente 15. Deve ser
//considerado que qualquer n�mero elevado a zero � 1, e elevado a 1 � ele pr�prio. Observe que
//neste exerc�cio n�o pode ser utilizado o operador de exponencia��o do portuguol (^).