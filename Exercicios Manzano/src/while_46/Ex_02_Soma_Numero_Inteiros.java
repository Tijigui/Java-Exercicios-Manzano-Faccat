package while_46;

public class Ex_02_Soma_Numero_Inteiros {

	public static void main(String[] args) {

		int contadora = 1;
		 int acomuladora = 0;

		while (contadora < 101) {

			acomuladora = acomuladora + contadora;
			System.out.println(acomuladora);
			contadora++;
		}

	}

}

//Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).