package while_46;

public class Ex_04_Verificar_Numeros_Impares_0_20 {
	public static void main(String[] args) {

		int contadora = 0;

		while (contadora < 21) {

			if (contadora % 2 == 1) {

				System.out.println(contadora);
			}
			contadora++;
		}

	}

}

//Apresentar todos os valores num�ricos inteiros �mpares situados na faixa de 0 a 20. Para verificar
//se o n�mero � �mpar, efetuar dentro da malha a verifica��o l�gica desta condi��o com a instru��o
//se, perguntando se o n�mero � �mpar; sendo, mostre-o; n�o sendo, passe para o pr�ximo passo.