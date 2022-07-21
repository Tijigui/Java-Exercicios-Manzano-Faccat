package operadores_logicos;

import java.util.Scanner;

public class Ex_14_Novo_Salario_Funcionário {

	public static void main(String[] args) {
		Scanner  sc =new Scanner(System.in);

		
		System.out.println("Informe o salario mensal do trabalhador: ");
		float SM = sc.nextFloat();
		
		System.out.println("Informe o percentutal de reajuste para o funcionário: ");
		float PR =sc.nextFloat();
		
		float NS= (float) (((PR* SM)/100)+SM);
		
		System.out.println("O Novo Salário do funcionário é: "+NS);
		
		sc.close();
	}

}
//Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador e também o valor do
//percentual de reajuste (variável PR) a ser atribuído. Apresentar o valor do novo salário (variável NS).