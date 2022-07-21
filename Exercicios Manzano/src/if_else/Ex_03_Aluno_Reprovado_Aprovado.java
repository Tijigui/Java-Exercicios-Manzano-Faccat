package if_else;

import java.util.Scanner;

public class Ex_03_Aluno_Reprovado_Aprovado {
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

		if (media >= 5) {
			System.out.println("Aluno Aprovado !!!");
			System.out.println("A média final do aluno é: " + media);
		} else {
			System.out.println("Aluno Reprovado !!!");
			System.out.println("A média final do aluno é: " + media);
		}

		sc.close();
	}
}

//Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
//dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 5. Se o aluno não
//foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o
//valor da média do aluno para qualquer condição.