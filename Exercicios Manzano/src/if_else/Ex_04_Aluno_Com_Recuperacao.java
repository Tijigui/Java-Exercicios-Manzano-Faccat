package if_else;

import java.util.Scanner;

public class Ex_04_Aluno_Com_Recuperacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe uma valor da Nota1: ");
		int nota1 = sc.nextInt();

		System.out.println("Informe uma valor da Nota2: ");
		int nota2 = sc.nextInt();

		System.out.println("Informe uma valor da Nota3: ");
		int nota3 = sc.nextInt();

		System.out.println("Informe uma valor da Nota4: ");
		int nota4 = sc.nextInt();

		float media = (float) ((nota1 + nota2 + nota3 + nota4) / 4);

		if (media >= 7) {
			System.out.println("Aluno Aprovado !!!");
			System.out.println("A m�dia final do aluno �: " + media);
		} else if (media < 7) {
			System.out.println("Voc� est� de Recupera��o, Informe a nota do exame: ");
			int exame = sc.nextInt();
			int novaMedia = (int) (media + exame);

			if (novaMedia >= 5) {
				System.out.println("O aluno foi Aprovado em Exame:");
				System.out.println("A nova media do aluno foi: "+novaMedia);
			}
		}

		sc.close();
	}

}

//Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
//dizendo que o aluno foi aprovado, se o valor da m�dia escolar for maior ou igual a 7. Se o valor da
//m�dia for menor que 7, solicitar a nota de exame, somar com o valor da m�dia e obter nova m�dia.
//Se a nova m�dia for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi
//aprovado em exame. Se o aluno n�o foi aprovado, indicar uma mensagem informando esta
//condi��o. Apresentar com as mensagens o valor da m�dia do aluno, para qualquer condi��o.