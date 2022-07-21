package operadores_logicos;

import java.util.Scanner;

public class Ex_15_Candidatos_Eleitoral {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de Votos Validos: ");
		float votosValidos = sc.nextFloat();

		System.out.println("Informe a quantidade de Votos Brancos: ");
		float votosBranco = sc.nextFloat();

		System.out.println("Informe a quantidade de Votos Nulos: ");
		float votosNulos = sc.nextFloat();

		int eleitores = (int) (votosValidos + votosNulos + votosBranco);

		System.out.println("O total de Eleitores é: " + eleitores);
		
		
		float percVotosValidos= (float)((votosValidos /eleitores)*100) ;
		float percVotosBranco= (float)((votosBranco /eleitores)*100);
		float percVotosNulos= (float)((votosNulos /eleitores)*100);

		System.out.println("O percentual de votos Validos é: "+percVotosValidos+"%");
		System.out.println("O percentual de votos Brancos é: "+percVotosBranco+"%");
		System.out.println("O percentual de votos Nulos é: "+percVotosNulos+"%");
		
		sc.close();
	}

}
//Em uma eleição sindical concorreram ao cargo de presidente três candidatos (A, B e C). Durante a
//apuração dos votos foram computados votos nulos e votos em branco, além dos votos válidos para
//cada candidato. Deve ser criado um programa de computador que efetue a leitura da quantidade de
//votos válidos para cada candidato, além de efetuar também a leitura da quantidade de votos nulos e
//votos em branco. Ao final o programa deve apresentar o número total de eleitores, considerando votos
//válidos, nulos e em branco; 
//o percentual correspondente de votos válidos em relação à quantidade de
//eleitores;

//o percentual correspondente de votos válidos do candidato A em relação à quantidade de
//eleitores; 
//o perc entual correspondente de votos válidos do candidato B em relação à quantidade de
//eleitores; 
//o percentual correspondente de votos válidos do candidato C em relação à quantidade de
//eleitores; 
//o percentual correspondente de votos nulos em relação à quantidade de eleitores; e por último
//o percentual correspondente de votos em branco em relação à quantidade de eleitores.