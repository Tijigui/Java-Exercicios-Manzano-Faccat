package operadores_logicos;

import java.util.Scanner;

public class Ex_14_Novo_Salario_Funcion�rio {

	public static void main(String[] args) {
		Scanner  sc =new Scanner(System.in);

		
		System.out.println("Informe o salario mensal do trabalhador: ");
		float SM = sc.nextFloat();
		
		System.out.println("Informe o percentutal de reajuste para o funcion�rio: ");
		float PR =sc.nextFloat();
		
		float NS= (float) (((PR* SM)/100)+SM);
		
		System.out.println("O Novo Sal�rio do funcion�rio �: "+NS);
		
		sc.close();
	}

}
//Ler o valor correspondente ao sal�rio mensal (vari�vel SM) de um trabalhador e tamb�m o valor do
//percentual de reajuste (vari�vel PR) a ser atribu�do. Apresentar o valor do novo sal�rio (vari�vel NS).