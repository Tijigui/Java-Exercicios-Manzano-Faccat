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

		System.out.println("O total de Eleitores �: " + eleitores);
		
		
		float percVotosValidos= (float)((votosValidos /eleitores)*100) ;
		float percVotosBranco= (float)((votosBranco /eleitores)*100);
		float percVotosNulos= (float)((votosNulos /eleitores)*100);

		System.out.println("O percentual de votos Validos �: "+percVotosValidos+"%");
		System.out.println("O percentual de votos Brancos �: "+percVotosBranco+"%");
		System.out.println("O percentual de votos Nulos �: "+percVotosNulos+"%");
		
		sc.close();
	}

}
//Em uma elei��o sindical concorreram ao cargo de presidente tr�s candidatos (A, B e C). Durante a
//apura��o dos votos foram computados votos nulos e votos em branco, al�m dos votos v�lidos para
//cada candidato. Deve ser criado um programa de computador que efetue a leitura da quantidade de
//votos v�lidos para cada candidato, al�m de efetuar tamb�m a leitura da quantidade de votos nulos e
//votos em branco. Ao final o programa deve apresentar o n�mero total de eleitores, considerando votos
//v�lidos, nulos e em branco; 
//o percentual correspondente de votos v�lidos em rela��o � quantidade de
//eleitores;

//o percentual correspondente de votos v�lidos do candidato A em rela��o � quantidade de
//eleitores; 
//o perc entual correspondente de votos v�lidos do candidato B em rela��o � quantidade de
//eleitores; 
//o percentual correspondente de votos v�lidos do candidato C em rela��o � quantidade de
//eleitores; 
//o percentual correspondente de votos nulos em rela��o � quantidade de eleitores; e por �ltimo
//o percentual correspondente de votos em branco em rela��o � quantidade de eleitores.